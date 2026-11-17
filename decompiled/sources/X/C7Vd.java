package X;

import android.content.Context;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* renamed from: X.7Vd, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7Vd {
    public static final AKH<C78T> A01 = new AGO(new C8i2(2));
    public static G2j<? super C78T, ? super Context, ? super BI3, ? super C0874AGa, ? extends InterfaceC2026Awf> A00 = new G2j() { // from class: X.6Xa
        @Override // X.G2j
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return new PlatformSelectionBehaviorsImpl((Context) obj2, (BI3) obj3, (C0874AGa) obj4, (C78T) obj);
        }
    };

    /* JADX WARN: Incorrect types in method signature: (LX/ArD;Landroid/content/Context;ZLjava/lang/CharSequence;LX/Au3;LX/Awf;LX/G0U<-LX/ArD;Lkotlin/Unit;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(final android.content.Context r12, X.C1794ArD r13, X.InterfaceC2026Awf r14, X.Au3 r15, final java.lang.CharSequence r16, X.G0U r17, final boolean r18) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7Vd.A01(android.content.Context, X.ArD, X.Awf, X.Au3, java.lang.CharSequence, X.G0U, boolean):void");
    }

    public static final InterfaceC2026Awf A00(BI3 bi3, BFM bfm, C0874AGa c0874AGa, int i) {
        bfm.AgE(430530635);
        Object objA6v = bfm.A6v(AndroidCompositionLocals_androidKt.A01);
        Object objA6v2 = bfm.A6v(A01);
        boolean zA1K = AnonymousClass003.A1K(bfm, objA6v2, objA6v) | ((((i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) ^ 48) > 32 && bfm.A65(c0874AGa)) || (i & 48) == 32);
        InterfaceC2026Awf interfaceC2026AwfAaT = bfm.AaT();
        if (zA1K || interfaceC2026AwfAaT == C78N.A00) {
            interfaceC2026AwfAaT = A00.invoke(objA6v2, objA6v, bi3, c0874AGa);
            bfm.Ai0(interfaceC2026AwfAaT);
        }
        InterfaceC2026Awf interfaceC2026Awf = (InterfaceC2026Awf) interfaceC2026AwfAaT;
        AnonymousClass002.A19(bfm);
        return interfaceC2026Awf;
    }
}
