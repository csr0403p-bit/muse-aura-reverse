package com.facebook.aura.widgets;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C6t6;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.widgets.SpaceSnapshotRenderer$render$2$1$loaded$1", f = "SpaceSnapshotRenderer.kt", l = {111, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 113}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SpaceSnapshotRenderer$render$2$1$loaded$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HtmlSpacesWebViewSession $session;
    public final /* synthetic */ C6t6 $webView;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceSnapshotRenderer$render$2$1$loaded$1$1", f = "SpaceSnapshotRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceSnapshotRenderer$render$2$1$loaded$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return C3cG.A0P(z);
        }

        public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceSnapshotRenderer$render$2$1$loaded$1(HtmlSpacesWebViewSession htmlSpacesWebViewSession, C6t6 c6t6, HtJ<? super SpaceSnapshotRenderer$render$2$1$loaded$1> htJ) {
        super(2, htJ);
        this.$session = htmlSpacesWebViewSession;
        this.$webView = c6t6;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SpaceSnapshotRenderer$render$2$1$loaded$1(this.$session, this.$webView, htJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0031, code lost:
    
        if (X.AbstractC9777Gfy.A00(r8, r0, r2) == r5) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r6 = 4
            r7 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L18
            if (r0 == r3) goto L2e
            if (r0 == r4) goto L3c
            if (r0 == r7) goto L2e
            if (r0 != r6) goto L59
            X.Hwg.A00(r9)
        L15:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L18:
            X.Hwg.A00(r9)
            com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession r0 = r8.$session
            X.BLG<java.lang.Boolean> r2 = r0.isLoading
            r1 = 0
            com.facebook.aura.widgets.SpaceSnapshotRenderer$render$2$1$loaded$1$1 r0 = new com.facebook.aura.widgets.SpaceSnapshotRenderer$render$2$1$loaded$1$1
            r0.<init>(r1)
            r8.label = r3
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r8, r0, r2)
        L2b:
            if (r0 != r5) goto L31
            return r5
        L2e:
            X.Hwg.A00(r9)
        L31:
            X.6t6 r0 = r8.$webView
            r8.label = r4
            java.lang.Object r9 = com.facebook.aura.widgets.SpaceSnapshotRendererKt.isPageSettled(r0, r8)
            if (r9 != r5) goto L3f
            return r5
        L3c:
            X.Hwg.A00(r9)
        L3f:
            boolean r0 = X.AnonymousClass001.A1X(r9)
            if (r0 != 0) goto L4e
            r8.label = r7
            r0 = 250(0xfa, double:1.235E-321)
            java.lang.Object r0 = X.C7Bq.A01(r0, r8)
            goto L2b
        L4e:
            X.6t6 r0 = r8.$webView
            r8.label = r6
            java.lang.Object r0 = com.facebook.aura.widgets.SpaceSnapshotRendererKt.awaitVisualState(r0, r8)
            if (r0 != r5) goto L15
            return r5
        L59:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceSnapshotRenderer$render$2$1$loaded$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SpaceSnapshotRenderer$render$2$1$loaded$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
