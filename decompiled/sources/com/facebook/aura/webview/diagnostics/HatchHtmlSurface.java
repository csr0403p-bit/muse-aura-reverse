package com.facebook.aura.webview.diagnostics;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.gateway.store.HatchVmTypeSwitchCheckpointStore;
import com.facebook.aura.markdown.parser.custom.extensions.MermaidExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchHtmlSurface {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchHtmlSurface[] $VALUES;
    public static final HatchHtmlSurface CHAT_MARKDOWN;
    public static final HatchHtmlSurface CHAT_WIDGET;
    public static final HatchHtmlSurface CHECKPOINT;
    public static final HatchHtmlSurface EMBEDDED_HTML;
    public static final HatchHtmlSurface HTML_PDF_EXPORT;
    public static final HatchHtmlSurface HTML_SOURCE_EDITOR;
    public static final HatchHtmlSurface INBOUND_DEEPLINK;
    public static final HatchHtmlSurface KATEX;
    public static final HatchHtmlSurface LEGAL_PAGE;
    public static final HatchHtmlSurface LOCAL_MAP_WIDGET;
    public static final HatchHtmlSurface MERMAID;
    public static final HatchHtmlSurface NDA;
    public static final HatchHtmlSurface PPTX;
    public static final HatchHtmlSurface SHARED_CONTENT;
    public static final HatchHtmlSurface SPACE;
    public static final HatchHtmlSurface SPACE_CARD;
    public static final HatchHtmlSurface WORKSPACE_HTML;
    public static final HatchHtmlSurface WORKSPACE_SLIDES;
    public static final HatchHtmlSurface WORKSPACE_THUMBNAIL;
    public final boolean isAgentGenerated;
    public final HatchHtmlPipeline pipeline;
    public final String wireName;

    static {
        HatchHtmlPipeline hatchHtmlPipeline = HatchHtmlPipeline.WORKSPACE_ARTIFACT;
        HatchHtmlSurface hatchHtmlSurface = new HatchHtmlSurface("WORKSPACE_HTML", 0, "workspace_html", hatchHtmlPipeline, true);
        WORKSPACE_HTML = hatchHtmlSurface;
        HatchHtmlSurface hatchHtmlSurface2 = new HatchHtmlSurface("WORKSPACE_SLIDES", 1, "workspace_slides", hatchHtmlPipeline, true);
        WORKSPACE_SLIDES = hatchHtmlSurface2;
        HatchHtmlSurface hatchHtmlSurface3 = new HatchHtmlSurface("WORKSPACE_THUMBNAIL", 2, "workspace_thumbnail", HatchHtmlPipeline.THUMBNAIL, true);
        WORKSPACE_THUMBNAIL = hatchHtmlSurface3;
        HatchHtmlSurface hatchHtmlSurface4 = new HatchHtmlSurface("HTML_SOURCE_EDITOR", 3, "html_source_editor", hatchHtmlPipeline, true);
        HTML_SOURCE_EDITOR = hatchHtmlSurface4;
        HatchHtmlSurface hatchHtmlSurface5 = new HatchHtmlSurface("PPTX", 4, "pptx", hatchHtmlPipeline, true);
        PPTX = hatchHtmlSurface5;
        HatchHtmlSurface hatchHtmlSurface6 = new HatchHtmlSurface("HTML_PDF_EXPORT", 5, "html_pdf_export", hatchHtmlPipeline, true);
        HTML_PDF_EXPORT = hatchHtmlSurface6;
        HatchHtmlPipeline hatchHtmlPipeline2 = HatchHtmlPipeline.INLINE_WIDGET;
        HatchHtmlSurface hatchHtmlSurface7 = new HatchHtmlSurface("CHAT_WIDGET", 6, "chat_widget", hatchHtmlPipeline2, true);
        CHAT_WIDGET = hatchHtmlSurface7;
        HatchHtmlSurface hatchHtmlSurface8 = new HatchHtmlSurface("LOCAL_MAP_WIDGET", 7, "local_map_widget", hatchHtmlPipeline2, true);
        LOCAL_MAP_WIDGET = hatchHtmlSurface8;
        HatchHtmlSurface hatchHtmlSurface9 = new HatchHtmlSurface("EMBEDDED_HTML", 8, "embedded_html", hatchHtmlPipeline2, true);
        EMBEDDED_HTML = hatchHtmlSurface9;
        HatchHtmlSurface hatchHtmlSurface10 = new HatchHtmlSurface("KATEX", 9, "katex", hatchHtmlPipeline2, true);
        KATEX = hatchHtmlSurface10;
        HatchHtmlSurface hatchHtmlSurface11 = new HatchHtmlSurface("MERMAID", 10, MermaidExtension.LANGUAGE, hatchHtmlPipeline2, true);
        MERMAID = hatchHtmlSurface11;
        HatchHtmlPipeline hatchHtmlPipeline3 = HatchHtmlPipeline.SPACE;
        HatchHtmlSurface hatchHtmlSurface12 = new HatchHtmlSurface("SPACE", 11, "space", hatchHtmlPipeline3, true);
        SPACE = hatchHtmlSurface12;
        HatchHtmlSurface hatchHtmlSurface13 = new HatchHtmlSurface("SPACE_CARD", 12, "space_card", hatchHtmlPipeline3, true);
        SPACE_CARD = hatchHtmlSurface13;
        HatchHtmlPipeline hatchHtmlPipeline4 = HatchHtmlPipeline.WEB_PAGE;
        HatchHtmlSurface hatchHtmlSurface14 = new HatchHtmlSurface("SHARED_CONTENT", 13, "shared_content", hatchHtmlPipeline4, true);
        SHARED_CONTENT = hatchHtmlSurface14;
        HatchHtmlSurface hatchHtmlSurface15 = new HatchHtmlSurface("LEGAL_PAGE", 14, "legal_page", hatchHtmlPipeline4, false);
        LEGAL_PAGE = hatchHtmlSurface15;
        HatchHtmlSurface hatchHtmlSurface16 = new HatchHtmlSurface("NDA", 15, "nda", hatchHtmlPipeline4, false);
        NDA = hatchHtmlSurface16;
        HatchHtmlSurface hatchHtmlSurface17 = new HatchHtmlSurface("CHECKPOINT", 16, HatchVmTypeSwitchCheckpointStore.KEY_CHECKPOINT, hatchHtmlPipeline4, false);
        CHECKPOINT = hatchHtmlSurface17;
        HatchHtmlPipeline hatchHtmlPipeline5 = HatchHtmlPipeline.LINK_ROUTING;
        HatchHtmlSurface hatchHtmlSurface18 = new HatchHtmlSurface("CHAT_MARKDOWN", 17, "chat_markdown", hatchHtmlPipeline5, true);
        CHAT_MARKDOWN = hatchHtmlSurface18;
        HatchHtmlSurface hatchHtmlSurface19 = new HatchHtmlSurface("INBOUND_DEEPLINK", 18, "inbound_deeplink", hatchHtmlPipeline5, false);
        INBOUND_DEEPLINK = hatchHtmlSurface19;
        HatchHtmlSurface[] hatchHtmlSurfaceArr = {hatchHtmlSurface, hatchHtmlSurface2, hatchHtmlSurface3, hatchHtmlSurface4, hatchHtmlSurface5, hatchHtmlSurface6, hatchHtmlSurface7, hatchHtmlSurface8, hatchHtmlSurface9, hatchHtmlSurface10, hatchHtmlSurface11, hatchHtmlSurface12, hatchHtmlSurface13, hatchHtmlSurface14, hatchHtmlSurface15, hatchHtmlSurface16, hatchHtmlSurface17, hatchHtmlSurface18, hatchHtmlSurface19};
        $VALUES = hatchHtmlSurfaceArr;
        $ENTRIES = C3cG.A0w(hatchHtmlSurfaceArr);
    }

    public static Ey9<HatchHtmlSurface> getEntries() {
        return $ENTRIES;
    }

    public static HatchHtmlSurface valueOf(String str) {
        return (HatchHtmlSurface) Enum.valueOf(HatchHtmlSurface.class, str);
    }

    public static HatchHtmlSurface[] values() {
        return (HatchHtmlSurface[]) $VALUES.clone();
    }

    public final HatchHtmlPipeline getPipeline() {
        return this.pipeline;
    }

    public final String getWireName() {
        return this.wireName;
    }

    public final boolean isAgentGenerated() {
        return this.isAgentGenerated;
    }

    public HatchHtmlSurface(String str, int i, String str2, HatchHtmlPipeline hatchHtmlPipeline, boolean z) {
        this.wireName = str2;
        this.pipeline = hatchHtmlPipeline;
        this.isAgentGenerated = z;
    }
}
