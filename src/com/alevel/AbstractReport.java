package com.alevel;

public abstract class AbstractReport {

    protected String header;
    protected String footer;

    protected AbstractReport(String header, String footer) {
        this.header = header;
        this.footer = footer;
    }

    public abstract String getHeader();

    public abstract String getFooter();
}
