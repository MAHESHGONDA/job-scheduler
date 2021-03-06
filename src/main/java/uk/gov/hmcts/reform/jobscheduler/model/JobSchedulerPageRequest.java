package uk.gov.hmcts.reform.jobscheduler.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.data.domain.Sort;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public final class JobSchedulerPageRequest extends org.springframework.data.domain.PageRequest {

    @Deprecated
    private JobSchedulerPageRequest(int page, int size, Sort sort) {
        super(page, size, sort);
    }

    public static JobSchedulerPageRequest of(int page, int size) {
        return new JobSchedulerPageRequest(page, size, null);
    }
}
