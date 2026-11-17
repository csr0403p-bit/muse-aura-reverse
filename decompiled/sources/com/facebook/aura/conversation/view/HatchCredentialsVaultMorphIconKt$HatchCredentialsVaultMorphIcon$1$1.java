package com.facebook.aura.conversation.view;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchCredentialsVaultMorphIconKt$HatchCredentialsVaultMorphIcon$1$1", f = "HatchCredentialsVaultMorphIcon.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT, HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX, 78}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchCredentialsVaultMorphIconKt$HatchCredentialsVaultMorphIcon$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $animateSettle;
    public final /* synthetic */ AT5<Float, AOW> $progress;
    public final /* synthetic */ boolean $settled;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCredentialsVaultMorphIconKt$HatchCredentialsVaultMorphIcon$1$1(boolean z, AT5<Float, AOW> at5, boolean z2, HtJ<? super HatchCredentialsVaultMorphIconKt$HatchCredentialsVaultMorphIcon$1$1> htJ) {
        super(2, htJ);
        this.$settled = z;
        this.$progress = at5;
        this.$animateSettle = z2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCredentialsVaultMorphIconKt$HatchCredentialsVaultMorphIcon$1$1(this.$settled, this.$progress, this.$animateSettle, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r3 = 3
            r2 = 1
            r5 = 2
            if (r0 == 0) goto L14
            if (r0 == r2) goto L4f
            if (r0 == r5) goto L4f
            if (r0 == r3) goto L4f
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L14:
            X.Hwg.A00(r8)
            boolean r0 = r7.$settled
            if (r0 != 0) goto L2a
            X.AT5<java.lang.Float, X.AOW> r4 = r7.$progress
            java.lang.Float r1 = X.AnonymousClass001.A0l()
            r7.label = r2
        L23:
            java.lang.Object r0 = r4.A04(r1, r7)
        L27:
            if (r0 != r6) goto L52
            return r6
        L2a:
            boolean r1 = r7.$animateSettle
            X.AT5<java.lang.Float, X.AOW> r4 = r7.$progress
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L47
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            X.28s r2 = X.C2HU.A02
            r1 = 0
            r0 = 3200(0xc80, float:4.484E-42)
            X.ASj r0 = X.AnonymousClass002.A0J(r2, r0)
            r7.label = r5
            java.lang.Object r0 = X.AnonymousClass002.A0i(r4, r0, r3, r7, r1)
            goto L27
        L47:
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            r7.label = r3
            goto L23
        L4f:
            X.Hwg.A00(r8)
        L52:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchCredentialsVaultMorphIconKt$HatchCredentialsVaultMorphIcon$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchCredentialsVaultMorphIconKt$HatchCredentialsVaultMorphIcon$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
