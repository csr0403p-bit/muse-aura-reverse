package com.facebook.aura.webview.diagnostics;

import X.AnonymousClass003;
import X.C06H;

/* loaded from: classes3.dex */
public final class HatchHtmlDiagnosticsEntry {
    public final long atMs;
    public final String detail;
    public final Long durationMs;
    public final HatchHtmlEntrySource entrySource;
    public final HatchHtmlErrorCode errorCode;
    public final String event;
    public final HatchHtmlSurface surface;

    public /* synthetic */ HatchHtmlDiagnosticsEntry(long j, HatchHtmlSurface hatchHtmlSurface, String str, HatchHtmlErrorCode hatchHtmlErrorCode, Long l, String str2, HatchHtmlEntrySource hatchHtmlEntrySource, int i, C06H c06h) {
        this(j, hatchHtmlSurface, str, hatchHtmlErrorCode, l, str2, (i & 64) != 0 ? null : hatchHtmlEntrySource);
    }

    public final long getAtMs() {
        return this.atMs;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final Long getDurationMs() {
        return this.durationMs;
    }

    public final HatchHtmlEntrySource getEntrySource() {
        return this.entrySource;
    }

    public final HatchHtmlErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final String getEvent() {
        return this.event;
    }

    public final HatchHtmlSurface getSurface() {
        return this.surface;
    }

    public HatchHtmlDiagnosticsEntry(long j, HatchHtmlSurface hatchHtmlSurface, String str, HatchHtmlErrorCode hatchHtmlErrorCode, Long l, String str2, HatchHtmlEntrySource hatchHtmlEntrySource) {
        AnonymousClass003.A0x(hatchHtmlSurface, str);
        this.atMs = j;
        this.surface = hatchHtmlSurface;
        this.event = str;
        this.errorCode = hatchHtmlErrorCode;
        this.durationMs = l;
        this.detail = str2;
        this.entrySource = hatchHtmlEntrySource;
    }
}
