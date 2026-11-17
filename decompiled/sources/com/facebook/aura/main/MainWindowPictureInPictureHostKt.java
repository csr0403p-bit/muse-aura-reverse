package com.facebook.aura.main;

import X.AKL;
import X.AKQ;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BN;
import X.C1BO;
import X.C2CK;
import X.C78N;
import X.C78e;
import X.F60;
import X.G0U;
import X.G0V;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.livesession.api.LiveSessions;
import com.facebook.aura.main.api.MainWindowPictureInPicture;
import com.facebook.aura.main.api.MainWindowPipRequest;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchPictureInPictureModeKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class MainWindowPictureInPictureHostKt {

    /* renamed from: com.facebook.aura.main.MainWindowPictureInPictureHostKt$MainWindowPictureInPictureHost$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MainWindowPictureInPictureHostKt.MainWindowPictureInPictureHost(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.MainWindowPictureInPictureHostKt$MainWindowPictureInPictureHost$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MainWindowPictureInPictureHostKt.MainWindowPictureInPictureHost(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.MainWindowPictureInPictureHostKt$MainWindowPipParamsEffect$3, reason: invalid class name and case insensitive filesystem */
    public final class C126623 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ MainWindowPipController $controller;
        public final /* synthetic */ boolean $inPictureInPicture;
        public final /* synthetic */ boolean $liveSessionActive;
        public final /* synthetic */ MainWindowPictureInPicture $owner;
        public final /* synthetic */ MainWindowPipRequest $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126623(MainWindowPipController mainWindowPipController, MainWindowPictureInPicture mainWindowPictureInPicture, MainWindowPipRequest mainWindowPipRequest, boolean z, boolean z2, int i) {
            super(2);
            this.$controller = mainWindowPipController;
            this.$owner = mainWindowPictureInPicture;
            this.$request = mainWindowPipRequest;
            this.$liveSessionActive = z;
            this.$inPictureInPicture = z2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MainWindowPictureInPictureHostKt.MainWindowPipParamsEffect(this.$controller, this.$owner, this.$request, this.$liveSessionActive, this.$inPictureInPicture, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void MainWindowPictureInPictureHost(BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        ComponentActivity componentActivity;
        Object next;
        MainWindowPictureInPicture mainWindowPictureInPicture;
        MainWindowPipRequest mainWindowPipRequest;
        BRg bRg2 = bRg;
        bfm.AgG(1241503000);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objA6v = bfm.A6v(AKL.A00);
            if (!(objA6v instanceof ComponentActivity) || (componentActivity = (ComponentActivity) objA6v) == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass3 = new MainWindowPictureInPictureHostKt$MainWindowPictureInPictureHost$activity$1(bRg2, i, i2);
                }
            } else {
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = new ArrayList(0);
                    bfm.Ai0(objAaT);
                }
                List<MainWindowPictureInPicture> list = (List) objAaT;
                if (list.isEmpty()) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        anonymousClass3 = new AnonymousClass1(bRg2, i, i2);
                    }
                } else {
                    AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
                    boolean zA65 = bfm.A65(abstractC3358CGzA0h);
                    Object objAaT2 = bfm.AaT();
                    if (zA65 || objAaT2 == obj) {
                        objAaT2 = LiveSessions.INSTANCE.isActive(abstractC3358CGzA0h);
                        bfm.Ai0(objAaT2);
                    }
                    C1BO c1boA02 = C2CK.A02(bfm, (C1BN) objAaT2);
                    bfm.AgE(-916507054);
                    ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                    for (MainWindowPictureInPicture mainWindowPictureInPicture2 : list) {
                        arrayListA0i.add(new HxE(mainWindowPictureInPicture2, mainWindowPictureInPicture2.request(bfm, 0)));
                    }
                    BBI bbi = (BBI) bfm;
                    BBI.A0R(bbi, false);
                    Iterator it = arrayListA0i.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((HxE) next).second != 0) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    HxE hxE = (HxE) next;
                    if (hxE == null || C1BO.A0F(c1boA02)) {
                        hxE = null;
                    }
                    boolean zA1K = AnonymousClass003.A1K(bfm, componentActivity, abstractC3358CGzA0h);
                    Object objAaT3 = bfm.AaT();
                    if (zA1K || objAaT3 == obj) {
                        objAaT3 = new MainWindowPipController(componentActivity);
                        bfm.Ai0(objAaT3);
                    }
                    MainWindowPipController mainWindowPipController = (MainWindowPipController) objAaT3;
                    boolean zRememberIsInPictureInPictureMode = HatchPictureInPictureModeKt.rememberIsInPictureInPictureMode(componentActivity, bfm, 0);
                    if (hxE != null) {
                        mainWindowPictureInPicture = (MainWindowPictureInPicture) hxE.first;
                        mainWindowPipRequest = (MainWindowPipRequest) hxE.second;
                    } else {
                        mainWindowPictureInPicture = null;
                        mainWindowPipRequest = null;
                    }
                    MainWindowPipParamsEffect(mainWindowPipController, mainWindowPictureInPicture, mainWindowPipRequest, C1BO.A0F(c1boA02), zRememberIsInPictureInPictureMode, bfm, (MainWindowPipRequest.$stable << 6) | MainWindowPipController.$stable);
                    boolean zA66 = bfm.A66(C1BO.A0F(c1boA02)) | AnonymousClass003.A1T(bfm, mainWindowPipController, zRememberIsInPictureInPictureMode);
                    Object objAaT4 = bfm.AaT();
                    if (zA66 || objAaT4 == obj) {
                        objAaT4 = mainWindowPipController.owner;
                        if (objAaT4 == null || !zRememberIsInPictureInPictureMode || C1BO.A0F(c1boA02)) {
                            objAaT4 = null;
                        }
                        bfm.Ai0(objAaT4);
                    }
                    MainWindowPictureInPicture mainWindowPictureInPicture3 = (MainWindowPictureInPicture) objAaT4;
                    if (mainWindowPictureInPicture3 != null) {
                        bfm.AgE(1653758828);
                        C1062ATq c1062ATq = C10G.A01;
                        BRg bRgA0N = C06G.A0N(bfm, bRg2.then(c1062ATq));
                        InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                        int iA0J = AnonymousClass003.A0J(bbi);
                        AKQ akqA04 = BBI.A04(bbi);
                        BRg bRgA01 = AxM.A01(bfm, bRgA0N);
                        Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                        if (bbi.A0V == null) {
                            C00x.A00();
                            throw F60.createAndThrow();
                        }
                        AnonymousClass005.A0n(bfm, bbi, function0);
                        AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                        boolean zA67 = bfm.A67(mainWindowPipController);
                        Object objAaT5 = bfm.AaT();
                        if (zA67 || objAaT5 == obj) {
                            objAaT5 = new MainWindowPictureInPictureHostKt$MainWindowPictureInPictureHost$2$1$1(mainWindowPipController);
                            bfm.Ai0(objAaT5);
                        }
                        mainWindowPictureInPicture3.Content((Function0) ((InterfaceC7353EnQ) objAaT5), c1062ATq, bfm, 48);
                        BBI.A0R(bbi, true);
                    } else {
                        bfm.AgE(1654033674);
                    }
                    BBI.A0R(bbi, false);
                }
            }
            bBbAAc.A06 = anonymousClass3;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(bRg2, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }

    public static final void MainWindowPipParamsEffect(MainWindowPipController mainWindowPipController, MainWindowPictureInPicture mainWindowPictureInPicture, MainWindowPipRequest mainWindowPipRequest, boolean z, boolean z2, BFM bfm, int i) {
        bfm.AgG(-1781044657);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(mainWindowPipController, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(mainWindowPictureInPicture, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(mainWindowPipRequest, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z2);
        }
        boolean z3 = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            Object[] objArr = {mainWindowPipController, mainWindowPictureInPicture, mainWindowPipRequest, Boolean.valueOf(z), Boolean.valueOf(z2)};
            int i2 = iA05 & 14;
            boolean zA1E = AnonymousClass003.A1E(iA05) | (i2 == 4 || ((iA05 & 8) != 0 && bfm.A67(mainWindowPipController))) | ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(mainWindowPictureInPicture))) | ((iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(mainWindowPipRequest)));
            Object objAaT = bfm.AaT();
            if (zA1E || objAaT == C78N.A00) {
                objAaT = new MainWindowPictureInPictureHostKt$MainWindowPipParamsEffect$1$1(z, mainWindowPipController, mainWindowPictureInPicture, mainWindowPipRequest, null);
                bfm.Ai0(objAaT);
            }
            C78e.A08(bfm, (G0V) objAaT, objArr);
            if (i2 != 4 && ((iA05 & 8) == 0 || !bfm.A67(mainWindowPipController))) {
                z3 = false;
            }
            Object objAaT2 = bfm.AaT();
            if (z3 || objAaT2 == C78N.A00) {
                objAaT2 = new MainWindowPictureInPictureHostKt$MainWindowPipParamsEffect$2$1(mainWindowPipController);
                bfm.Ai0(objAaT2);
            }
            int i3 = MainWindowPipController.$stable;
            C78e.A05(bfm, mainWindowPipController, (G0U) objAaT2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126623(mainWindowPipController, mainWindowPictureInPicture, mainWindowPipRequest, z, z2, i);
        }
    }
}
