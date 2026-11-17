package com.facebook.aura.file.view;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C7BY;
import X.FGI;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchFileTypeKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ArtifactFileActionMenuKt {
    public static final String SANDBOX_REFERENCE_PREFIX = "sandbox://";
    public static final String WORKSPACE_REFERENCE_PREFIX = "workspace/";

    public static final Map<String, String> fileEditorMetadata(HatchScreen hatchScreen, String str) {
        if (hatchScreen == HatchScreen.FILE_EDITOR) {
            return HatchFileTypeKt.hatchFileTypeMetadata(str);
        }
        return null;
    }

    public static final void logFileMenuClick(HatchScreen hatchScreen, HatchComponent hatchComponent, String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.LIBRARY, null, hatchScreen, hatchComponent, null, fileEditorMetadata(hatchScreen, str), null);
    }

    public static final void logFileMenuDismiss(HatchScreen hatchScreen, String str) {
        HatchSubsurface hatchSubsurface;
        HatchComponent hatchComponent;
        boolean zA1Z = AnonymousClass002.A1Z(hatchScreen, HatchScreen.FILE_EDITOR);
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.LIBRARY;
        if (zA1Z) {
            hatchSubsurface = HatchSubsurface.DOT_MENU;
            hatchComponent = HatchComponent.THREE_DOTS_MENU;
        } else {
            hatchSubsurface = null;
            hatchComponent = HatchComponent.ARTIFACT_OVERFLOW_MENU;
        }
        hatchInteractionLogger.logDismiss(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, fileEditorMetadata(hatchScreen, str));
    }

    public static final String workspaceShareReference(String str) {
        if (AnonymousClass005.A1a(str, SANDBOX_REFERENCE_PREFIX)) {
            return str;
        }
        String strA0a = C7BY.A0a(str, '/');
        return !AnonymousClass005.A1a(strA0a, "workspace/") ? FGI.A0M("workspace/", strA0a) : strA0a;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x035b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01dc  */
    /* renamed from: ArtifactFileActionMenu-nEJ3PNA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m883ArtifactFileActionMenunEJ3PNA(java.lang.String r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, boolean r72, boolean r73, kotlin.jvm.functions.Function0<kotlin.Unit> r74, kotlin.jvm.functions.Function0<kotlin.Unit> r75, kotlin.jvm.functions.Function0<kotlin.Unit> r76, boolean r77, kotlin.jvm.functions.Function0<kotlin.Unit> r78, com.facebook.aura.analytics.hatch.HatchScreen r79, java.lang.String r80, long r81, boolean r83, X.BFM r84, int r85, int r86, int r87) {
        /*
            Method dump skipped, instructions count: 1563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.ArtifactFileActionMenuKt.m883ArtifactFileActionMenunEJ3PNA(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, com.facebook.aura.analytics.hatch.HatchScreen, java.lang.String, long, boolean, X.BFM, int, int, int):void");
    }
}
