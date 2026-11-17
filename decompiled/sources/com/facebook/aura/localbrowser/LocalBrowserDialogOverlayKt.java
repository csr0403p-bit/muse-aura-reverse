package com.facebook.aura.localbrowser;

import X.AKQ;
import X.AbstractC1754Apr;
import X.AbstractC1798ArH;
import X.AbstractC2271BQs;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0Yr;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C78g;
import X.C8j3;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.localbrowser.LocalBrowserTarget;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class LocalBrowserDialogOverlayKt {
    /* renamed from: $r8$lambda$6WdLyNiyLRK7-x_gC-KQLsBFNqA, reason: not valid java name */
    public static /* synthetic */ Unit m1217$r8$lambda$6WdLyNiyLRK7x_gCKQLsBFNqA(G0U g0u) {
        AnonymousClass001.A1K(true, g0u);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit $r8$lambda$S979Qb7Jz9VX82Mgwq3vjSCdapw(G0U g0u) {
        AnonymousClass001.A1K(false, g0u);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit $r8$lambda$_ogpEtr89_OBcs5D70f5muLqUiI(G0U g0u) {
        AnonymousClass001.A1K(false, g0u);
        return Unit.INSTANCE;
    }

    public static final void LocalBrowserDialogOverlay(final LocalBrowserSession localBrowserSession, final LocalBrowserTarget.HostLease hostLease, BRg bRg, BFM bfm, final int i, final int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(localBrowserSession, 0);
        bfm.AgG(-1350998355);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(localBrowserSession, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(hostLease, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean z2 = false;
            C1BO c1boA02 = C2CK.A02(bfm, localBrowserSession.facts);
            C1BO c1boA022 = C2CK.A02(bfm, localBrowserSession.dialogs.revision);
            int i4 = iA05 & 14;
            if (i4 == 4 || ((iA05 & 8) != 0 && bfm.A65(localBrowserSession))) {
                z2 = true;
            }
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = AbstractC1798ArH.A07(null, bfm);
            }
            final MutableState mutableState = (MutableState) objAaT;
            Object[] objArr = {localBrowserSession, hostLease, ((LocalBrowserFacts) c1boA02.getValue()).control, Long.valueOf(C3cG.A05(c1boA022.getValue()))};
            boolean zA65 = bfm.A65(mutableState) | ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(hostLease)));
            if (i4 != 4 && ((iA05 & 8) == 0 || !bfm.A67(localBrowserSession))) {
                z = false;
            }
            boolean z3 = zA65 | z;
            Object objAaT2 = bfm.AaT();
            if (z3 || objAaT2 == C78N.A00) {
                objAaT2 = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserDialogOverlayKt$$ExternalSyntheticLambda6
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return LocalBrowserDialogOverlayKt.LocalBrowserDialogOverlay$lambda$5$0(hostLease, localBrowserSession, mutableState, (C0Yr) obj);
                    }
                };
                BBI.A0T(bfm, objAaT2);
            }
            C78e.A07(bfm, (G0U) objAaT2, objArr);
            if (hostLease == null || ((LocalBrowserFacts) c1boA02.getValue()).control != LocalBrowserControl.USER) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                }
                final BRg bRg3 = bRg2;
                g0v = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserDialogOverlayKt$$ExternalSyntheticLambda7
                    @Override // X.G0V
                    public final Object invoke(Object obj, Object obj2) {
                        LocalBrowserSession localBrowserSession2 = localBrowserSession;
                        LocalBrowserTarget.HostLease hostLease2 = hostLease;
                        BRg bRg4 = bRg3;
                        int i5 = i;
                        LocalBrowserDialogOverlayKt.LocalBrowserDialogOverlay(localBrowserSession2, hostLease2, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i5), i2);
                        return Unit.INSTANCE;
                    }
                };
            } else {
                LocalBrowserUserDialog localBrowserUserDialog = (LocalBrowserUserDialog) mutableState.getValue();
                if (localBrowserUserDialog == null) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    }
                    final BRg bRg4 = bRg2;
                    g0v = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserDialogOverlayKt$$ExternalSyntheticLambda8
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            LocalBrowserSession localBrowserSession2 = localBrowserSession;
                            LocalBrowserTarget.HostLease hostLease2 = hostLease;
                            BRg bRg5 = bRg4;
                            int i5 = i;
                            LocalBrowserDialogOverlayKt.LocalBrowserDialogOverlay(localBrowserSession2, hostLease2, bRg5, (BFM) obj, AnonymousClass011.A02(obj2, i5), i2);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    bfm.Ag8(-1229276111, localBrowserUserDialog.id);
                    LocalBrowserUserDialog(localBrowserSession, localBrowserUserDialog, bRg2, bfm, LocalBrowserSession.$stable | i4 | (LocalBrowserUserDialog.$stable << 3) | (iA05 & 896), 0);
                    AnonymousClass001.A1D(bfm);
                }
            }
            bBbAAc.A06 = g0v;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg5 = bRg2;
            g0v = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserDialogOverlayKt$$ExternalSyntheticLambda9
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    LocalBrowserSession localBrowserSession2 = localBrowserSession;
                    LocalBrowserTarget.HostLease hostLease2 = hostLease;
                    BRg bRg6 = bRg5;
                    int i5 = i;
                    LocalBrowserDialogOverlayKt.LocalBrowserDialogOverlay(localBrowserSession2, hostLease2, bRg6, (BFM) obj, AnonymousClass011.A02(obj2, i5), i2);
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    public static final Unit LocalBrowserUserDialog$lambda$7$0$0$0(MutableState mutableState, String str) {
        if (C8j3.A0J(str, 1) <= 8192) {
            mutableState.Af8(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserUserDialog$lambda$8$0$0(String str, LocalBrowserUserDialog localBrowserUserDialog, String str2, final G0U g0u, AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 4);
        Function0<Unit> function0 = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserDialogOverlayKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AnonymousClass001.A1K(true, g0u);
                return Unit.INSTANCE;
            }
        };
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.primaryButton(str, (Drawable) null, true, false, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, function0, (String) null, Integer.MAX_VALUE, (BRg) bs0);
        if (localBrowserUserDialog.kind != LocalBrowserDialogKind.ALERT) {
            auraButtonGroupScope.secondaryButton(str2, null, true, false, AnonymousClass000.A00(53), new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserDialogOverlayKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    AnonymousClass001.A1K(false, g0u);
                    return Unit.INSTANCE;
                }
            }, null, bs0);
        }
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserUserDialog$lambda$8$0$0$0(G0U g0u) {
        AnonymousClass001.A1K(true, g0u);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserUserDialog$lambda$8$0$0$1(G0U g0u) {
        AnonymousClass001.A1K(false, g0u);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserUserDialog$lambda$9$0(G0U g0u) {
        AnonymousClass001.A1K(false, g0u);
        return Unit.INSTANCE;
    }

    public static final C78g LocalBrowserDialogOverlay$lambda$5$0(LocalBrowserTarget.HostLease hostLease, LocalBrowserSession localBrowserSession, MutableState mutableState, C0Yr c0Yr) {
        mutableState.Af8(hostLease != null ? localBrowserSession.dialogs.firstForUser(hostLease) : null);
        return new C78g() { // from class: com.facebook.aura.localbrowser.LocalBrowserDialogOverlayKt$LocalBrowserDialogOverlay$lambda$5$0$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }

    public static final void LocalBrowserUserDialog(final LocalBrowserSession localBrowserSession, final LocalBrowserUserDialog localBrowserUserDialog, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1777385716);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(localBrowserSession, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(localBrowserUserDialog, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA65 = bfm.A65(localBrowserUserDialog.id);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AbstractC1798ArH.A07(localBrowserUserDialog.defaultValue, bfm);
            }
            final MutableState mutableState = (MutableState) objAaT;
            boolean zA652 = bfm.A65(localBrowserUserDialog.id);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = AbstractC1798ArH.A07(false, bfm);
            }
            final MutableState mutableState2 = (MutableState) objAaT2;
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableState, bfm.A65(mutableState2) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(localBrowserSession))), (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(localBrowserUserDialog)));
            Object objAaT3 = bfm.AaT();
            if (zA1W || objAaT3 == C78N.A00) {
                objAaT3 = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserDialogOverlayKt$$ExternalSyntheticLambda1
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return LocalBrowserDialogOverlayKt.LocalBrowserUserDialog$lambda$6$0(localBrowserSession, localBrowserUserDialog, mutableState, mutableState2, AnonymousClass001.A1X(obj));
                    }
                };
                BBI.A0T(bfm, objAaT3);
            }
            final G0U g0u = (G0U) objAaT3;
            String strA01 = localBrowserUserDialog.origin;
            if (strA01 == null) {
                bfm.AgE(-1329292821);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c82);
            } else {
                bfm.AgE(-1329293348);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            BRg bRgA00 = AbstractC1754Apr.A00(bRg2);
            B1U b1uA00 = B1V.A00(bfm, new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserDialogOverlayKt$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    return LocalBrowserDialogOverlayKt.LocalBrowserUserDialog$lambda$7(localBrowserUserDialog, mutableState, mutableState2, (BFM) obj, AnonymousClass001.A0F(obj2));
                }
            }, 390057346);
            B1U b1uA002 = B1V.A00(bfm, new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserDialogOverlayKt$$ExternalSyntheticLambda3
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    return LocalBrowserDialogOverlayKt.LocalBrowserUserDialog$lambda$8(g0u, localBrowserUserDialog, (BFM) obj, AnonymousClass001.A0F(obj2));
                }
            }, 399827907);
            boolean zA653 = bfm.A65(g0u);
            Object objAaT4 = bfm.AaT();
            if (zA653 || objAaT4 == C78N.A00) {
                objAaT4 = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserDialogOverlayKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        AnonymousClass001.A1K(false, g0u);
                        return Unit.INSTANCE;
                    }
                };
                BBI.A0O(bbiA07, objAaT4);
            }
            AuraAlertDialogKt.AuraAlertDialog(bRgA00, strA01, (String) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) b1uA00, (G0V<? super BFM, ? super Integer, Unit>) b1uA002, (Function0<Unit>) objAaT4, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, 221184, 0, 1932);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserDialogOverlayKt$$ExternalSyntheticLambda5
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    LocalBrowserSession localBrowserSession2 = localBrowserSession;
                    LocalBrowserUserDialog localBrowserUserDialog2 = localBrowserUserDialog;
                    BRg bRg4 = bRg3;
                    int i4 = i;
                    LocalBrowserDialogOverlayKt.LocalBrowserUserDialog(localBrowserSession2, localBrowserUserDialog2, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit LocalBrowserUserDialog$lambda$6$0(LocalBrowserSession localBrowserSession, LocalBrowserUserDialog localBrowserUserDialog, MutableState mutableState, MutableState mutableState2, boolean z) {
        LocalBrowserDialogs localBrowserDialogs = localBrowserSession.dialogs;
        String str = localBrowserUserDialog.id;
        String strA05 = MutableState.A05(mutableState);
        if (!z || localBrowserUserDialog.kind != LocalBrowserDialogKind.PROMPT) {
            strA05 = null;
        }
        MutableState.A09(!localBrowserDialogs.resolve(str, z, strA05), mutableState2);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserUserDialog$lambda$7(LocalBrowserUserDialog localBrowserUserDialog, final MutableState mutableState, MutableState mutableState2, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            BRg bRgA0T = AnonymousClass005.A0T(bfm, C10G.A0A(BRg.A00, Float.NaN, 360.0f));
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMedium, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(localBrowserUserDialog.message, null, 0L, null, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16382);
            if (localBrowserUserDialog.kind == LocalBrowserDialogKind.PROMPT) {
                bfm.AgE(-1671853852);
                String strA05 = MutableState.A05(mutableState);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c81);
                boolean zA65 = bfm.A65(mutableState);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserDialogOverlayKt$$ExternalSyntheticLambda10
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return LocalBrowserDialogOverlayKt.LocalBrowserUserDialog$lambda$7$0$0$0(mutableState, (String) obj);
                        }
                    };
                    BBI.A0O(bbi, objAaT);
                }
                AuraTextInputKt.AuraTextInput(strA05, strA01, null, null, null, null, null, null, false, 0, 0, null, null, null, null, false, false, false, false, null, (G0U) objAaT, bfm, 0, 0, 0, 1048572);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1671632822);
                BBI.A0R(bbi, false);
            }
            if (MutableState.A0A(mutableState2)) {
                bfm.AgE(-608111622);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c7f), null, C3cH.A0W(bfm).errorText, null, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16378);
            } else {
                bfm.AgE(-1671435414);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserUserDialog$lambda$8(final G0U g0u, final LocalBrowserUserDialog localBrowserUserDialog, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            final String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c7e);
            final String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206f0);
            boolean zA1O = AnonymousClass003.A1O(bfm, localBrowserUserDialog, strA012, AnonymousClass003.A1K(bfm, strA01, g0u));
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserDialogOverlayKt$$ExternalSyntheticLambda0
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return LocalBrowserDialogOverlayKt.LocalBrowserUserDialog$lambda$8$0$0(strA01, localBrowserUserDialog, strA012, g0u, (AuraButtonGroupScope) obj);
                    }
                };
                BBI.A0T(bfm, objAaT);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(null, null, null, null, null, null, null, false, (G0U) objAaT, bfm, 0, 255);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserDialogOverlay$lambda$6(LocalBrowserSession localBrowserSession, LocalBrowserTarget.HostLease hostLease, BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserDialogOverlay(localBrowserSession, hostLease, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserDialogOverlay$lambda$7(LocalBrowserSession localBrowserSession, LocalBrowserTarget.HostLease hostLease, BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserDialogOverlay(localBrowserSession, hostLease, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserDialogOverlay$lambda$8(LocalBrowserSession localBrowserSession, LocalBrowserTarget.HostLease hostLease, BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserDialogOverlay(localBrowserSession, hostLease, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserUserDialog$lambda$10(LocalBrowserSession localBrowserSession, LocalBrowserUserDialog localBrowserUserDialog, BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserUserDialog(localBrowserSession, localBrowserUserDialog, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
