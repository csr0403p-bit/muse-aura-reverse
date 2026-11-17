package com.facebook.aura.localbrowser;

import X.AbstractC1564Ale;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.C10G;
import X.C1822Arm;
import X.C1BO;
import X.C20Q;
import X.C2CK;
import X.C2Cx;
import X.C2VU;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.Ey9;
import X.G0U;
import X.G0V;
import X.InterfaceC0857A6e;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.browsertask.view.BrowserTaskCardContentKt;
import com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel;
import com.facebook.aura.model.BrowserTaskIdKt;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.LocalBrowserScreenKey;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class LocalBrowserTaskViewerKt {
    public static final Unit LocalBrowserCardPlaceholder$lambda$0$0(String str, InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 1);
        AbstractC1564Ale.A08(interfaceC0857A6e, str);
        AbstractC1564Ale.A04(interfaceC0857A6e);
        AbstractC1564Ale.A01(C2Cx.A03, interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final boolean hasLiveLocalBrowserTask(AbstractC3358CGz abstractC3358CGz, String str) {
        boolean zA1a = AnonymousClass002.A1a(abstractC3358CGz, str);
        Collection<LocalBrowserSession> collectionValues = LocalBrowserRuntime.Companion.getInstance(abstractC3358CGz).activeSessions.getValue().values();
        if (collectionValues == null || !collectionValues.isEmpty()) {
            for (LocalBrowserSession localBrowserSession : collectionValues) {
                LocalBrowserTask localBrowserTask = localBrowserSession.task;
                if (localBrowserTask != null && !localBrowserTask.retired && isFor(localBrowserSession, str)) {
                    return zA1a;
                }
            }
        }
        return false;
    }

    public static final int localBrowserOutcomeRes(LocalBrowserTaskOutcome localBrowserTaskOutcome) {
        C7384Etj.A0Y(localBrowserTaskOutcome, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (localBrowserTaskOutcome.ordinal()) {
            case 0:
                return R.string._name_removed__res_0x7f120c87;
            case 1:
            case 5:
                return R.string._name_removed__res_0x7f120c86;
            case 2:
                return R.string._name_removed__res_0x7f120ca0;
            case 3:
                return R.string._name_removed__res_0x7f120c89;
            case 4:
                return R.string._name_removed__res_0x7f120ca4;
            default:
                throw C3cG.A0q();
        }
    }

    public static final BrowserTaskPresentation localBrowserTaskPresentation(BrowserTaskPresentation browserTaskPresentation, BFM bfm, int i) {
        C7384Etj.A0Y(browserTaskPresentation, 0);
        LocalBrowserTaskPresentationViewModel.Factory factory = new LocalBrowserTaskPresentationViewModel.Factory(AnonymousClass002.A0h(bfm));
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 == null) {
            throw AnonymousClass001.A0o();
        }
        LocalBrowserTaskPresentationViewModel localBrowserTaskPresentationViewModel = (LocalBrowserTaskPresentationViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(LocalBrowserTaskPresentationViewModel.class));
        bfm.AgE(-1574432519);
        Ey9<LocalBrowserTaskOutcome> entries = LocalBrowserTaskOutcome.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(entries));
        Iterator<LocalBrowserTaskOutcome> it = entries.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            LocalBrowserTaskOutcome next = it.next();
            linkedHashMap.put(next, AbstractC2271BQs.A01(bfm, localBrowserOutcomeRes(next)));
        }
        AnonymousClass001.A1D(bfm);
        boolean zA1W = AnonymousClass002.A1W(bfm, linkedHashMap, bfm.A65(localBrowserTaskPresentationViewModel), (((i & 14) ^ 6) > 4 && bfm.A65(browserTaskPresentation)) || (i & 6) == 4);
        Object objAaT = bfm.AaT();
        if (zA1W || objAaT == C78N.A00) {
            objAaT = localBrowserTaskPresentationViewModel.uiState(browserTaskPresentation, linkedHashMap);
            bfm.Ai0(objAaT);
        }
        return C3cH.A0S(C2CK.A01(bfm, null, localBrowserTaskPresentationViewModel.initialUiState(browserTaskPresentation, linkedHashMap), (C20Q) objAaT, BrowserTaskPresentation.$stable << 3, 14));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalBrowserTaskOutcome.values().length];
            try {
                AnonymousClass002.A13(LocalBrowserTaskOutcome.INTERRUPTED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LocalBrowserTaskOutcome.IDLE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(LocalBrowserTaskOutcome.ABANDONED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(LocalBrowserTaskOutcome.FAILED_TO_START, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(LocalBrowserTaskOutcome.BROWSER_LOST, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(LocalBrowserTaskOutcome.STOPPED, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void LocalBrowserMissingTaskPreview(final String str, BRg bRg, BFM bfm, final int i, final int i2) {
        final BRg bRg2 = bRg;
        bfm.AgG(1532667135);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = {str};
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTaskViewerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnonymousClass005.A0Q();
                    }
                };
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            boolean zA65 = bfm.A65(mutableStateA0N);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new LocalBrowserTaskViewerKt$LocalBrowserMissingTaskPreview$1$1(mutableStateA0N, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, str);
            if (MutableState.A0A(mutableStateA0N)) {
                bfm.AgE(-110450076);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c8c);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                C1822Arm c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
                long jA07 = C3cH.A07(bfm, auraTheme);
                BRg bRgA02 = C10G.A02(C2VU.A09, bRg2, false);
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == obj) {
                    objAaT3 = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserTaskViewerKt$$ExternalSyntheticLambda1
                        @Override // X.G0U
                        public final Object invoke(Object obj2) {
                            AnonymousClass002.A11((InterfaceC0857A6e) obj2);
                            return Unit.INSTANCE;
                        }
                    };
                    bfm.Ai0(objAaT3);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA02, objAaT3, false), jA07, c1822ArmA0B, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            } else {
                bfm.AgE(-110070636);
                LocalBrowserCardPlaceholder(bRg2, bfm, (iA0d >> 3) & 14, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserTaskViewerKt$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    String str2 = str;
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    LocalBrowserTaskViewerKt.LocalBrowserMissingTaskPreview(str2, bRg3, (BFM) obj2, AnonymousClass011.A00(i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LocalBrowserTaskPreview(final java.lang.String r25, X.BRg r26, X.BFM r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTaskViewerKt.LocalBrowserTaskPreview(java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    /* renamed from: $r8$lambda$LUIwBHyx-gDCOOvM_8lyPH66uhA, reason: not valid java name */
    public static /* synthetic */ Unit m1227$r8$lambda$LUIwBHyxgDCOOvM_8lyPH66uhA(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit $r8$lambda$RH3ft3CPSE0StH6uh2b_IExarMk(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final void LocalBrowserCardPlaceholder(final BRg bRg, BFM bfm, final int i, final int i2) {
        bfm.AgG(-699398262);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            final String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ca7);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserTaskViewerKt$$ExternalSyntheticLambda5
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return LocalBrowserTaskViewerKt.LocalBrowserCardPlaceholder$lambda$0$0(strA01, (InterfaceC0857A6e) obj);
                    }
                };
                bfm.Ai0(objAaT);
            }
            BrowserTaskCardContentKt.BrowserTaskCardPlaceholder(AnonymousClass001.A0Y(bRg, objAaT, false), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserTaskViewerKt$$ExternalSyntheticLambda6
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BRg bRg2 = bRg;
                    int i4 = i;
                    int i5 = i2;
                    AnonymousClass001.A0F(obj2);
                    LocalBrowserTaskViewerKt.LocalBrowserCardPlaceholder(bRg2, (BFM) obj, AnonymousClass011.A00(i4), i5);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit LocalBrowserCardPlaceholder$lambda$1(BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserCardPlaceholder(bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserMissingTaskPreview$lambda$4$0(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserMissingTaskPreview$lambda$5(String str, BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserMissingTaskPreview(str, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserTaskPreview$lambda$5$0(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserTaskPreview$lambda$6(String str, BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserTaskPreview(str, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final boolean isFor(LocalBrowserSession localBrowserSession, String str) {
        String str2;
        AnonymousClass003.A0u(localBrowserSession, str);
        LocalBrowserTask localBrowserTask = localBrowserSession.task;
        if (localBrowserTask == null || (str2 = localBrowserTask.id) == null) {
            str2 = localBrowserSession.id;
        }
        return BrowserTaskIdKt.canonicalBrowserTaskId(str2).equals(BrowserTaskIdKt.canonicalBrowserTaskId(str));
    }

    public static final String localBrowserTaskOpenLabel(String str, String str2, BFM bfm, int i) {
        AnonymousClass004.A1b(str, str2);
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = LocalBrowserRuntime.Companion.getInstance(abstractC3358CGzA0h);
            bfm.Ai0(objAaT);
        }
        Collection collectionValues = ((Map) C1BO.A07(bfm, ((LocalBrowserRuntime) objAaT).activeSessions)).values();
        if (collectionValues == null || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                LocalBrowserTask localBrowserTask = ((LocalBrowserSession) it.next()).task;
                if (localBrowserTask != null && C3cH.A0b(localBrowserTask).equals(BrowserTaskIdKt.logicalBrowserTaskId(str)) && !localBrowserTask.retired) {
                    bfm.AgE(-294813910);
                    break;
                }
            }
            bfm.AgE(-294813287);
            str2 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c8a);
        } else {
            bfm.AgE(-294813287);
            str2 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c8a);
        }
        AnonymousClass001.A1D(bfm);
        return str2;
    }

    public static final AuraNavKey localBrowserTaskScreenKey(AbstractC3358CGz abstractC3358CGz, String str, boolean z) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        if (!C7BY.A0j(str)) {
            Map<String, LocalBrowserSession> value = LocalBrowserRuntime.Companion.getInstance(abstractC3358CGz).activeSessions.getValue();
            List<BrowserTaskPresentation> value2 = BrowserTaskRepository.Companion.getInstance(abstractC3358CGz).activeTasks.getValue();
            if (!(value2 instanceof Collection) || !C3cG.A1N(value2)) {
                Iterator<T> it = value2.iterator();
                while (it.hasNext()) {
                    if (BrowserTaskIdKt.canonicalBrowserTaskId(((BrowserTaskPresentation) it.next()).browserTaskId).equals(BrowserTaskIdKt.canonicalBrowserTaskId(str))) {
                        break;
                    }
                }
            }
            Collection<LocalBrowserSession> collectionValues = value.values();
            if (collectionValues == null || !collectionValues.isEmpty()) {
                Iterator<LocalBrowserSession> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    if (isFor(it2.next(), str)) {
                        return new LocalBrowserScreenKey(str, z);
                    }
                }
            }
        }
        return null;
    }
}
