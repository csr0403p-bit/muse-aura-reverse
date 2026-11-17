package X;

import com.facebook.aura.feed.view.FeedEditHapticsKt;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS, 177, FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE, 180, 182}, m = "invokeSuspend", v = 1)
/* renamed from: X.3Er, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3Er extends AbstractC07127nr implements G0W<C20Z<? super C3Eq>, Integer, HtJ<? super Unit>, Object> {
    public /* synthetic */ int I$0;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C3Es this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/3Es;LX/HtJ<-LX/3Er;>;)V */
    public C3Er(HtJ htJ, C3Es c3Es) {
        super(3, htJ);
        this.this$0 = c3Es;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r5 = r11.L$0
            X.20Z r5 = (X.C20Z) r5
            int r4 = r11.I$0
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r2 = 5
            r7 = 4
            r10 = 3
            r8 = 2
            r6 = 1
            if (r0 == 0) goto L20
            if (r0 == r6) goto L83
            if (r0 == r8) goto L46
            if (r0 == r10) goto L62
            if (r0 == r7) goto L76
            if (r0 == r2) goto L83
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L20:
            X.Hwg.A00(r12)
            if (r4 <= 0) goto L35
            X.3Eq r1 = X.C3Eq.A02
            r0 = 0
            r11.L$0 = r0
            r11.I$0 = r4
            r11.label = r6
        L2e:
            java.lang.Object r0 = r5.emit(r1, r11)
            if (r0 != r3) goto L86
            return r3
        L35:
            X.3Es r0 = r11.this$0
            long r0 = r0.A01
            r11.L$0 = r5
            r11.I$0 = r4
            r11.label = r8
            java.lang.Object r0 = X.C7Bq.A01(r0, r11)
            if (r0 != r3) goto L49
            return r3
        L46:
            X.Hwg.A00(r12)
        L49:
            X.3Es r0 = r11.this$0
            long r0 = r0.A00
            r8 = 0
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 <= 0) goto L79
            X.3Eq r0 = X.C3Eq.A03
            r11.L$0 = r5
            r11.I$0 = r4
            r11.label = r10
            java.lang.Object r0 = r5.emit(r0, r11)
            if (r0 != r3) goto L65
            return r3
        L62:
            X.Hwg.A00(r12)
        L65:
            X.3Es r0 = r11.this$0
            long r0 = r0.A00
            r11.L$0 = r5
            r11.I$0 = r4
            r11.label = r7
            java.lang.Object r0 = X.C7Bq.A01(r0, r11)
            if (r0 != r3) goto L79
            return r3
        L76:
            X.Hwg.A00(r12)
        L79:
            X.3Eq r1 = X.C3Eq.A04
            r0 = 0
            r11.L$0 = r0
            r11.I$0 = r4
            r11.label = r2
            goto L2e
        L83:
            X.Hwg.A00(r12)
        L86:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Er.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(C20Z<? super C3Eq> c20z, Integer num, HtJ<? super Unit> htJ) {
        int iA0F = AnonymousClass001.A0F(num);
        C3Er c3Er = new C3Er(htJ, this.this$0);
        c3Er.L$0 = c20z;
        c3Er.I$0 = iA0F;
        return c3Er.invokeSuspend(Unit.INSTANCE);
    }
}
