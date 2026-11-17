package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class ApprovalBrowserScreenshotKt {
    public static final float FallbackAspectRatio = 1.7777778f;
    public static final float PortraitFrameAspectRatio = 1.3333334f;

    /* renamed from: com.facebook.aura.agentpermission.ApprovalBrowserScreenshotKt$ApprovalBrowserScreenshot$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Float $knownAspectRatio;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $overlay;
        public final /* synthetic */ C1DM $shape;
        public final /* synthetic */ String $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, Float f, C1DM c1dm, BRg bRg, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$uri = str;
            this.$knownAspectRatio = f;
            this.$shape = c1dm;
            this.$modifier = bRg;
            this.$overlay = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ApprovalBrowserScreenshotKt.ApprovalBrowserScreenshot(this.$uri, this.$knownAspectRatio, this.$shape, this.$modifier, this.$overlay, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ApprovalBrowserScreenshot(java.lang.String r38, java.lang.Float r39, X.C1DM r40, X.BRg r41, X.G0W<? super X.InterfaceC05151eP, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r42, X.BFM r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.ApprovalBrowserScreenshotKt.ApprovalBrowserScreenshot(java.lang.String, java.lang.Float, X.1DM, X.BRg, X.G0W, X.BFM, int, int):void");
    }
}
