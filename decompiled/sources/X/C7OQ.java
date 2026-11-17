package X;

import androidx.compose.runtime.MutableState;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function0;

/* renamed from: X.7OQ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7OQ {
    public static final C7OU A00(final Hx6 hx6, BFM bfm, G0U g0u) {
        final MutableState mutableStateA00 = C1er.A00(bfm, hx6);
        final MutableState mutableStateA002 = C1er.A00(bfm, g0u);
        Object[] objArr = new Object[0];
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = new C8i2(0);
            bfm.Ai0(objAaT);
        }
        final String str = (String) AFz.A03(bfm, (Function0) objAaT, objArr);
        InterfaceC10559Hsu interfaceC10559HsuA00 = C7VU.A00(bfm);
        if (interfaceC10559HsuA00 == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        final AbstractC8583Fgi activityResultRegistry = interfaceC10559HsuA00.getActivityResultRegistry();
        Object objAaT2 = bfm.AaT();
        if (objAaT2 == obj) {
            objAaT2 = new C7OT();
            bfm.Ai0(objAaT2);
        }
        final C7OT c7ot = (C7OT) objAaT2;
        Object objAaT3 = bfm.AaT();
        if (objAaT3 == obj) {
            objAaT3 = new HwU<I>(c7ot, mutableStateA00) { // from class: X.7OU
                public final C7OT<I> A00;
                public final C1BO<Hx6<I, O>> A01;

                @Override // X.HwU
                @Deprecated(message = "Registration is automatically handled by rememberLauncherForActivityResult")
                public final void A00() {
                    throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
                }

                /* JADX WARN: Incorrect types in method signature: (TI;LX/72P;)V */
                @Override // X.HwU
                public final void A01(C72P c72p, Object obj2) {
                    HwU<I> hwU = this.A00.A00;
                    if (hwU == null) {
                        throw C3cG.A0Q("Launcher has not been initialized");
                    }
                    hwU.A01(c72p, obj2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.A00 = c7ot;
                    this.A01 = mutableStateA00;
                }
            };
            bfm.Ai0(objAaT3);
        }
        C7OU c7ou = (C7OU) objAaT3;
        boolean zA67 = bfm.A67(c7ot) | bfm.A67(activityResultRegistry) | bfm.A65(str) | bfm.A67(hx6) | bfm.A65(mutableStateA002);
        Object objAaT4 = bfm.AaT();
        if (zA67 || objAaT4 == obj) {
            objAaT4 = new G0U() { // from class: X.7OR
                @Override // X.G0U
                public final Object invoke(Object obj2) {
                    final C7OT c7ot2 = c7ot;
                    AbstractC8583Fgi abstractC8583Fgi = activityResultRegistry;
                    String str2 = str;
                    c7ot2.A00 = abstractC8583Fgi.A02(new C8iM(mutableStateA002, 0), hx6, str2);
                    return new C78g() { // from class: X.7OS
                        @Override // X.C78g
                        public final void dispose() {
                            HwU<I> hwU = c7ot2.A00;
                            if (hwU == 0) {
                                throw C3cG.A0Q("Launcher has not been initialized");
                            }
                            hwU.A00();
                        }
                    };
                }
            };
            bfm.Ai0(objAaT4);
        }
        C78e.A01(bfm, activityResultRegistry, str, hx6, (G0U) objAaT4);
        return c7ou;
    }
}
