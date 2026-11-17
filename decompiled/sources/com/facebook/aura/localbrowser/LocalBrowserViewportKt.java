package com.facebook.aura.localbrowser;

import X.AbstractC1532Ako;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import android.content.Context;
import androidx.activity.ComponentActivity;
import com.facebook.aura.localbrowser.LocalBrowserTarget;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public abstract class LocalBrowserViewportKt {
    public static final LocalBrowserViewportContainer LocalBrowserViewport$lambda$4$0(G0U g0u, LocalBrowserTarget localBrowserTarget, ComponentActivity componentActivity, LocalBrowserHostKind localBrowserHostKind, Context context) {
        C7384Etj.A0Y(context, 4);
        final LocalBrowserViewportContainer localBrowserViewportContainer = new LocalBrowserViewportContainer(context);
        localBrowserViewportContainer.setOnHostChanged(g0u);
        localBrowserViewportContainer.slot = localBrowserTarget.offerHost(componentActivity, localBrowserViewportContainer, localBrowserHostKind, new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserViewportKt$$ExternalSyntheticLambda8
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return LocalBrowserViewportKt.LocalBrowserViewport$lambda$4$0$0$0(localBrowserViewportContainer, (LocalBrowserTarget.HostLease) obj);
            }
        });
        return localBrowserViewportContainer;
    }

    public static final Unit LocalBrowserViewport$lambda$5$0(LocalBrowserViewportContainer localBrowserViewportContainer) {
        C7384Etj.A0Y(localBrowserViewportContainer, 0);
        localBrowserViewportContainer.acceptsUserInput = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserViewportKt$$ExternalSyntheticLambda7
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return AnonymousClass001.A0h();
            }
        };
        LocalBrowserTarget.HostSlot hostSlot = localBrowserViewportContainer.slot;
        if (hostSlot != null) {
            hostSlot.close();
        }
        localBrowserViewportContainer.slot = null;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit LocalBrowserViewport$lambda$6$0(X.G0U r2, kotlin.jvm.functions.Function0 r3, final boolean r4, final X.G0U r5, X.C1BO r6, com.facebook.aura.localbrowser.LocalBrowserViewportContainer r7) {
        /*
            r0 = 5
            X.C7384Etj.A0Y(r7, r0)
            r7.setOnHostChanged(r2)
            r7.setOnUserInteraction(r3)
            com.facebook.aura.localbrowser.LocalBrowserViewportKt$$ExternalSyntheticLambda9 r0 = new com.facebook.aura.localbrowser.LocalBrowserViewportKt$$ExternalSyntheticLambda9
            r0.<init>()
            r7.acceptsUserInput = r0
            r3 = 0
            if (r4 == 0) goto L28
            java.lang.Object r2 = r6.getValue()
            r1 = 0
            if (r2 == 0) goto L37
            com.facebook.aura.localbrowser.LocalBrowserTarget$HostLease r0 = r7.lease
            if (r2 != r0) goto L37
        L1f:
            boolean r2 = X.AnonymousClass003.A1X(r2, r5)
            r1 = 1
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r2 != 0) goto L2b
        L28:
            r1 = 0
            r0 = 393216(0x60000, float:5.51013E-40)
        L2b:
            r7.setDescendantFocusability(r0)
            if (r1 != 0) goto L31
            r3 = 4
        L31:
            r7.setImportantForAccessibility(r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L37:
            r2 = r1
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserViewportKt.LocalBrowserViewport$lambda$6$0(X.G0U, kotlin.jvm.functions.Function0, boolean, X.G0U, X.1BO, com.facebook.aura.localbrowser.LocalBrowserViewportContainer):kotlin.Unit");
    }

    public static /* synthetic */ boolean $r8$lambda$02NtcElsAjOsk9LV8NFm5bU8iww(LocalBrowserTarget.HostLease hostLease) {
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$we0ePDNP8pO6rtx2vGgC8YMR06E(LocalBrowserTarget.HostLease hostLease) {
        return false;
    }

    public static final boolean LocalBrowserViewport$lambda$0$0(LocalBrowserTarget.HostLease hostLease) {
        return false;
    }

    public static final Unit LocalBrowserViewport$lambda$4$0$0$0(LocalBrowserViewportContainer localBrowserViewportContainer, LocalBrowserTarget.HostLease hostLease) {
        localBrowserViewportContainer.lease = hostLease;
        localBrowserViewportContainer.onHostChanged.invoke(hostLease);
        return Unit.INSTANCE;
    }

    public static final boolean LocalBrowserViewport$lambda$5$0$0(LocalBrowserTarget.HostLease hostLease) {
        return false;
    }

    public static final boolean LocalBrowserViewport$lambda$6$0$0(boolean z, G0U g0u, LocalBrowserTarget.HostLease hostLease) {
        return z && AnonymousClass003.A1X(hostLease, g0u);
    }

    public static final Unit LocalBrowserViewport$lambda$7(ComponentActivity componentActivity, LocalBrowserTarget localBrowserTarget, BRg bRg, LocalBrowserHostKind localBrowserHostKind, boolean z, G0U g0u, G0U g0u2, Function0 function0, int i, int i2, BFM bfm, int i3) {
        LocalBrowserViewport(componentActivity, localBrowserTarget, bRg, localBrowserHostKind, z, g0u, g0u2, function0, bfm, AnonymousClass011.A01(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void LocalBrowserViewport(final ComponentActivity componentActivity, final LocalBrowserTarget localBrowserTarget, BRg bRg, LocalBrowserHostKind localBrowserHostKind, boolean z, G0U<? super LocalBrowserTarget.HostLease, Boolean> g0u, G0U<? super LocalBrowserTarget.HostLease, Unit> g0u2, Function0<Unit> function0, BFM bfm, final int i, final int i2) {
        int i3;
        boolean z2 = z;
        final G0U<? super LocalBrowserTarget.HostLease, Unit> g0u3 = g0u2;
        final BRg bRg2 = bRg;
        final LocalBrowserHostKind localBrowserHostKind2 = localBrowserHostKind;
        G0U<? super LocalBrowserTarget.HostLease, Boolean> g0u4 = g0u;
        Function0<Unit> function02 = function0;
        boolean zA1b = AnonymousClass004.A1b(componentActivity, localBrowserTarget);
        bfm.AgG(-889431175);
        if ((i & 6) == 0) {
            i3 = (bfm.A67(componentActivity) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? bfm.A65(localBrowserTarget) : bfm.A67(localBrowserTarget) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bfm.A65(bRg2) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bfm.A63(localBrowserHostKind == null ? -1 : localBrowserHostKind2.ordinal()) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= bfm.A66(z2) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        int i8 = 196608;
        if (i7 != 0) {
            i3 |= i8;
        } else if ((i & 196608) == 0) {
            i8 = 65536;
            if (bfm.A67(g0u4)) {
                i8 = 131072;
            }
            i3 |= i8;
        }
        int i9 = i2 & 64;
        int i10 = 1572864;
        if (i9 != 0) {
            i3 |= i10;
        } else if ((i & 1572864) == 0) {
            i10 = 524288;
            if (bfm.A67(g0u3)) {
                i10 = 1048576;
            }
            i3 |= i10;
        }
        int i11 = i2 & 128;
        int i12 = 12582912;
        if (i11 != 0) {
            i3 |= i12;
        } else if ((i & 12582912) == 0) {
            i12 = 4194304;
            if (bfm.A67(function02)) {
                i12 = 8388608;
            }
            i3 |= i12;
        }
        if (bfm.AfS(i3 & 1, AnonymousClass002.A1P(i3 & 4793491, 4793490))) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                localBrowserHostKind2 = LocalBrowserHostKind.PRESENTATION;
            }
            if (i6 != 0) {
                z2 = false;
            }
            if (i7 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserViewportKt$$ExternalSyntheticLambda0
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return AnonymousClass001.A0h();
                        }
                    };
                    bfm.Ai0(objAaT);
                }
                g0u4 = (G0U) objAaT;
            }
            if (i9 != 0) {
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserViewportKt$$ExternalSyntheticLambda1
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return Unit.INSTANCE;
                        }
                    };
                    bfm.Ai0(objAaT2);
                }
                g0u3 = (G0U) objAaT2;
            }
            if (i11 != 0) {
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == C78N.A00) {
                    objAaT3 = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserViewportKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    bfm.Ai0(objAaT3);
                }
                function02 = (Function0) objAaT3;
            }
            final C1BO c1boA02 = C2CK.A02(bfm, localBrowserTarget.currentHost);
            bfm.Ag8(-44850084, localBrowserTarget.id);
            int i13 = 3670016 & i3;
            boolean zA1Q = ((i3 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((i3 & 64) != 0 && bfm.A67(localBrowserTarget))) | AnonymousClass002.A1Q(i13, 1048576) | bfm.A67(componentActivity) | AnonymousClass002.A1Q(i3 & 7168, 2048);
            Object objAaT4 = bfm.AaT();
            if (zA1Q || objAaT4 == C78N.A00) {
                objAaT4 = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserViewportKt$$ExternalSyntheticLambda3
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return LocalBrowserViewportKt.LocalBrowserViewport$lambda$4$0(g0u3, localBrowserTarget, componentActivity, localBrowserHostKind2, (Context) obj);
                    }
                };
                bfm.Ai0(objAaT4);
            }
            G0U g0u5 = (G0U) objAaT4;
            Object objAaT5 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT5 == obj) {
                objAaT5 = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserViewportKt$$ExternalSyntheticLambda4
                    @Override // X.G0U
                    public final Object invoke(Object obj2) {
                        return LocalBrowserViewportKt.LocalBrowserViewport$lambda$5$0((LocalBrowserViewportContainer) obj2);
                    }
                };
                bfm.Ai0(objAaT5);
            }
            G0U g0u6 = (G0U) objAaT5;
            boolean zA1Q2 = AnonymousClass002.A1Q(29360128 & i3, 8388608) | AnonymousClass002.A1Q(i13, 1048576) | AnonymousClass002.A1Q(57344 & i3, 16384) | ((458752 & i3) == 131072) | bfm.A65(c1boA02);
            Object objAaT6 = bfm.AaT();
            if (zA1Q2 || objAaT6 == obj) {
                final G0U<? super LocalBrowserTarget.HostLease, Unit> g0u7 = g0u3;
                final Function0<Unit> function03 = function02;
                final boolean z3 = z2;
                final G0U<? super LocalBrowserTarget.HostLease, Boolean> g0u8 = g0u4;
                objAaT6 = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserViewportKt$$ExternalSyntheticLambda5
                    @Override // X.G0U
                    public final Object invoke(Object obj2) {
                        return LocalBrowserViewportKt.LocalBrowserViewport$lambda$6$0(g0u7, function03, z3, g0u8, c1boA02, (LocalBrowserViewportContainer) obj2);
                    }
                };
                bfm.Ai0(objAaT6);
            }
            AbstractC1532Ako.A03(bfm, bRg2, g0u5, null, g0u6, (G0U) objAaT6, ((i3 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 3456, zA1b ? 1 : 0);
            BBI.A0R((BBI) bfm, zA1b);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final G0U<? super LocalBrowserTarget.HostLease, Unit> g0u9 = g0u3;
            final Function0<Unit> function04 = function02;
            final LocalBrowserHostKind localBrowserHostKind3 = localBrowserHostKind2;
            final boolean z4 = z2;
            final G0U<? super LocalBrowserTarget.HostLease, Boolean> g0u10 = g0u4;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserViewportKt$$ExternalSyntheticLambda6
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    ComponentActivity componentActivity2 = componentActivity;
                    LocalBrowserTarget localBrowserTarget2 = localBrowserTarget;
                    BRg bRg3 = bRg2;
                    LocalBrowserHostKind localBrowserHostKind4 = localBrowserHostKind3;
                    boolean z5 = z4;
                    G0U g0u11 = g0u10;
                    G0U g0u12 = g0u9;
                    Function0 function05 = function04;
                    int i14 = i;
                    int i15 = i2;
                    ((Number) obj3).intValue();
                    LocalBrowserViewportKt.LocalBrowserViewport(componentActivity2, localBrowserTarget2, bRg3, localBrowserHostKind4, z5, g0u11, g0u12, function05, (BFM) obj2, AnonymousClass011.A01(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
