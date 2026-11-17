package X;

import androidx.camera.core.ImageCaptureException;
import java.util.ArrayDeque;

/* loaded from: classes5.dex */
public final class F4O implements InterfaceC2888Bnw {
    public final int $t;
    public final Object A00;

    public F4O(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.InterfaceC2888Bnw
    public final void ATX(InterfaceC2864BnO interfaceC2864BnO) {
        InterfaceC2873Bng interfaceC2873BngA8p;
        String strA0a;
        switch (this.$t) {
            case 0:
                BjK bjK = (BjK) this.A00;
                try {
                    InterfaceC2873Bng interfaceC2873BngA30 = interfaceC2864BnO.A30();
                    if (interfaceC2873BngA30 != null) {
                        BnB bnB = bjK.A09;
                        InterfaceC2886Bnt interfaceC2886BntAGK = interfaceC2873BngA30.AGK();
                        InterfaceC2861BnK interfaceC2861BnK = interfaceC2886BntAGK instanceof BnL ? ((BnL) interfaceC2886BntAGK).A00 : null;
                        if ((interfaceC2861BnK.ACH() == EnumC2859BnF.LOCKED_FOCUSED || interfaceC2861BnK.ACH() == EnumC2859BnF.PASSIVE_FOCUSED) && interfaceC2861BnK.ACG() == BnG.CONVERGED && interfaceC2861BnK.ACg() == EnumC2860BnH.CONVERGED) {
                            synchronized (bnB.A02) {
                                ArrayDeque<T> arrayDeque = bnB.A03;
                                interfaceC2873BngA8p = arrayDeque.size() >= 3 ? bnB.A8p() : null;
                                arrayDeque.addFirst(interfaceC2873BngA30);
                            }
                            if (bnB.A01 == null || interfaceC2873BngA8p == null) {
                                return;
                            } else {
                                interfaceC2873BngA30 = interfaceC2873BngA8p;
                            }
                        }
                        interfaceC2873BngA30.close();
                        return;
                    }
                    return;
                } catch (IllegalStateException e) {
                    AbstractC2875Bni.A02("ZslControlImpl", BV5.A0n("Failed to acquire latest image IllegalStateException = ", e));
                    return;
                }
            case 1:
                BnQ bnQ = (BnQ) this.A00;
                synchronized (bnQ.A0A) {
                    bnQ.A01++;
                }
                BnQ.A01(bnQ, interfaceC2864BnO);
                return;
            default:
                Bi6 bi6 = (Bi6) this.A00;
                try {
                    InterfaceC2873Bng interfaceC2873BngA302 = interfaceC2864BnO.A30();
                    if (interfaceC2873BngA302 == null) {
                        Bi7 bi7 = bi6.A04;
                        if (bi7 != null) {
                            bi6.A02(new Bi9(new ImageCaptureException(2, "Failed to acquire latest image", null), bi7.A02));
                            return;
                        }
                        return;
                    }
                    BoT.A00();
                    Bi7 bi72 = bi6.A04;
                    if (bi72 == null) {
                        strA0a = AnonymousClass007.A0a("Discarding ImageProxy which was inadvertently acquired: ", interfaceC2873BngA302);
                    } else {
                        if (interfaceC2873BngA302.AGK().ALU().A00.get(bi72.A09) != null) {
                            BoT.A00();
                            AbstractC2814Blr abstractC2814Blr = bi6.A03;
                            abstractC2814Blr.getClass();
                            ((Bi8) abstractC2814Blr).A02.accept(new C2701BiJ(interfaceC2873BngA302, bi6.A04));
                            Bi7 bi73 = bi6.A04;
                            bi6.A04 = null;
                            int i = bi73.A00;
                            if (i != -1 && i != 100) {
                                bi73.A00 = 100;
                                Bi2 bi2 = (Bi2) bi73.A07;
                                BoT.A00();
                                if (!bi2.A03) {
                                    final AbstractC2401BaE abstractC2401BaE = bi2.A06;
                                    ((C2699Bi3) abstractC2401BaE).A08.execute(new Runnable() { // from class: X.Bih
                                        public static final String __redex_internal_original_name = "TakePictureRequest$$ExternalSyntheticLambda3";

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                        }
                                    });
                                }
                            }
                            Bi2 bi22 = (Bi2) bi73.A07;
                            BoT.A00();
                            if (bi22.A03) {
                                return;
                            }
                            if (!bi22.A04) {
                                bi22.onCaptureStarted();
                            }
                            bi22.A00.A03(null);
                            return;
                        }
                        strA0a = "Discarding ImageProxy which was acquired for aborted request";
                    }
                    AbstractC2875Bni.A03("CaptureNode", strA0a);
                    interfaceC2873BngA302.close();
                    return;
                } catch (IllegalStateException e2) {
                    Bi7 bi74 = bi6.A04;
                    if (bi74 != null) {
                        bi6.A02(new Bi9(new ImageCaptureException(2, "Failed to acquire latest image", e2), bi74.A02));
                        return;
                    }
                    return;
                }
        }
    }
}
