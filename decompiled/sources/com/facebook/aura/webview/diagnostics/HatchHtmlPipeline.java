package com.facebook.aura.webview.diagnostics;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.opengraph.HatchWebPageParserKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchHtmlPipeline {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchHtmlPipeline[] $VALUES;
    public static final HatchHtmlPipeline INLINE_WIDGET;
    public static final HatchHtmlPipeline LINK_ROUTING;
    public static final HatchHtmlPipeline SPACE;
    public static final HatchHtmlPipeline THUMBNAIL;
    public static final HatchHtmlPipeline WEB_PAGE;
    public static final HatchHtmlPipeline WORKSPACE_ARTIFACT;
    public final String wireName;

    static {
        HatchHtmlPipeline hatchHtmlPipeline = new HatchHtmlPipeline("INLINE_WIDGET", 0, "inline_widget");
        INLINE_WIDGET = hatchHtmlPipeline;
        HatchHtmlPipeline hatchHtmlPipeline2 = new HatchHtmlPipeline("WORKSPACE_ARTIFACT", 1, "workspace_artifact");
        WORKSPACE_ARTIFACT = hatchHtmlPipeline2;
        HatchHtmlPipeline hatchHtmlPipeline3 = new HatchHtmlPipeline("THUMBNAIL", 2, HatchWebPageParserKt.THUMBNAIL);
        THUMBNAIL = hatchHtmlPipeline3;
        HatchHtmlPipeline hatchHtmlPipeline4 = new HatchHtmlPipeline("SPACE", 3, "space");
        SPACE = hatchHtmlPipeline4;
        HatchHtmlPipeline hatchHtmlPipeline5 = new HatchHtmlPipeline("WEB_PAGE", 4, "web_page");
        WEB_PAGE = hatchHtmlPipeline5;
        HatchHtmlPipeline hatchHtmlPipeline6 = new HatchHtmlPipeline("LINK_ROUTING", 5, "link_routing");
        LINK_ROUTING = hatchHtmlPipeline6;
        HatchHtmlPipeline[] hatchHtmlPipelineArr = {hatchHtmlPipeline, hatchHtmlPipeline2, hatchHtmlPipeline3, hatchHtmlPipeline4, hatchHtmlPipeline5, hatchHtmlPipeline6};
        $VALUES = hatchHtmlPipelineArr;
        $ENTRIES = C3cG.A0w(hatchHtmlPipelineArr);
    }

    public static Ey9<HatchHtmlPipeline> getEntries() {
        return $ENTRIES;
    }

    public static HatchHtmlPipeline valueOf(String str) {
        return (HatchHtmlPipeline) Enum.valueOf(HatchHtmlPipeline.class, str);
    }

    public static HatchHtmlPipeline[] values() {
        return (HatchHtmlPipeline[]) $VALUES.clone();
    }

    public final String getWireName() {
        return this.wireName;
    }

    public HatchHtmlPipeline(String str, int i, String str2) {
        this.wireName = str2;
    }
}
