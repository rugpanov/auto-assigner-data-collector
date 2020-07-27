package com.teamcity.autoAssignerDataCollector;

import jetbrains.buildServer.serverSide.SBuild;
import jetbrains.buildServer.serverSide.STestRun;

class TestInfo {
    private final String stacktrace;
    private String className;
    private String testMethod;
    private String testClass;
    private String testSuite;
    private int duration;
    private int orderId;
    private boolean isFixed;

    TestInfo(STestRun testRun) {
        this.className = testRun.getTest().getClass().getCanonicalName();
        this.testMethod = testRun.getTest().getName().getTestMethodName();
        this.testClass = testRun.getTest().getName().getClassName();
        this.testSuite = testRun.getTest().getName().getSuite();
        this.duration = testRun.getDuration();
        this.orderId = testRun.getOrderId();
        this.isFixed = testRun.isFixed();
        this.stacktrace = testRun.getFullText();
    }
}