package com.facebook.aura.header.view;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.header.view.AvatarScrollConnection$onPreScroll$1", f = "HatchAvatarPlaybackState.kt", l = {73}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AvatarScrollConnection$onPreScroll$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ AvatarScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarScrollConnection$onPreScroll$1(AvatarScrollConnection avatarScrollConnection, HtJ<? super AvatarScrollConnection$onPreScroll$1> htJ) {
        super(2, htJ);
        this.this$0 = avatarScrollConnection;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AvatarScrollConnection$onPreScroll$1(this.this$0, htJ);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002d -> B:6:0x000e). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r2 = 250(0xfa, double:1.235E-321)
            r7 = 1
            if (r0 == 0) goto L24
            if (r0 != r7) goto L30
            X.Hwg.A00(r10)
        Le:
            long r5 = android.os.SystemClock.uptimeMillis()
            com.facebook.aura.header.view.AvatarScrollConnection r4 = r9.this$0
            long r0 = r4.lastScrollTimeMs
            long r5 = r5 - r0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 < 0) goto L27
            com.facebook.aura.header.view.HatchAvatarPlaybackState r1 = r4.playback
            r0 = 0
            r1.setPaused$fbandroid_express_aura_java_com_facebook_aura_header_view_view(r4, r0)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L24:
            X.Hwg.A00(r10)
        L27:
            r9.label = r7
            java.lang.Object r0 = X.C7Bq.A01(r2, r9)
            if (r0 != r8) goto Le
            return r8
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.AvatarScrollConnection$onPreScroll$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new AvatarScrollConnection$onPreScroll$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
