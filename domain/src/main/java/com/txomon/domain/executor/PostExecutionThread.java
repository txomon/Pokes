package com.txomon.domain.executor;

import rx.Scheduler;

public interface PostExecutionThread {
    Scheduler getScheduler();
}
