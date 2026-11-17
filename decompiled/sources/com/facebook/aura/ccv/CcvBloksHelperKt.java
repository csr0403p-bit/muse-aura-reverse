package com.facebook.aura.ccv;

import X.AGH;
import X.AIW;
import X.AbstractC7559F3s;
import X.AbstractC7608F5v;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.BV8;
import X.C0881AGi;
import X.C0924AIa;
import X.C10535Hqe;
import X.C3cF;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7633F7q;
import X.C7727FCd;
import X.C79;
import X.C7933FLf;
import X.C8944Fu0;
import X.EnumC7948FMe;
import X.EnumC7949FMf;
import X.EnumC7950FMg;
import X.EnumC7951FMh;
import X.EnumC7952FMi;
import X.FBN;
import X.FBO;
import X.FD3;
import X.FHK;
import X.FHL;
import X.FHO;
import X.FMd;
import X.G0U;
import X.HiG;
import X.HlX;
import X.InterfaceC8011FPi;
import android.content.Context;
import android.widget.FrameLayout;
import com.facebook.aura.bloks.AuraBloksInitializer;
import com.facebook.aura.bloks.asynccomponent.AuraComponentQueryStoreProviderImpl;
import com.facebook.aura.bloks.screenquery.AuraBloksFullScreenContainerNavigator;
import com.facebook.aura.bloks.screenquery.AuraObjectSetUtilsKt;
import com.facebook.aura.bloks.screenquery.navigator.AuraCdsScreenQueryNavigator;
import com.instagram.common.bloks.BloksParseResult;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsOpenScreenCallerDismissCallback;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public abstract class CcvBloksHelperKt {

    /* renamed from: com.facebook.aura.ccv.CcvBloksHelperKt$openAccountLinkingUpsellBloksScreen$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* renamed from: com.facebook.aura.ccv.CcvBloksHelperKt$openAccountLinkingUpsellBloksScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ G0U<Integer, Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(G0U<? super Integer, Unit> g0u) {
            super(0);
            this.$onDismiss = g0u;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onDismiss.invoke(BV4.A0V());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ccv.CcvBloksHelperKt$openAccountLinkingUpsellBloksScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Function0<Unit> function0) {
            super(0);
            this.$onSuccess = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onSuccess.invoke();
        }
    }

    public static final void openAccountLinkingUpsellBloksScreen(Context context, HatchAccountLinkingTarget hatchAccountLinkingTarget, boolean z, Function0<Unit> function0, final G0U<? super Integer, Unit> g0u) {
        C7384Etj.A0Y(context, 0);
        AnonymousClass005.A12(hatchAccountLinkingTarget, function0, g0u, 1);
        AuraBloksInitializer.initBloksLazy(context);
        Map mapA16 = AbstractC7608F5v.A16(C3cG.A0r(C3cF.A00(18), hatchAccountLinkingTarget.getWireValue()), C3cG.A0r("context_data", null), C3cG.A0r("is_age_confirmation", Boolean.valueOf(z)), C3cG.A0r("on_dismiss", new C7633F7q(new C8944Fu0(new AnonymousClass3(g0u), 1))), C3cG.A0r("on_success", new C7633F7q(new C8944Fu0(new AnonymousClass4(function0), 2))));
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        linkedHashMapA0j.putAll(mapA16);
        if (new BitSet(0).nextClearBit(0) < 0) {
            throw C3cG.A0Q("Missing required params");
        }
        LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            if (FHK.A00.contains(entryA0l.getKey())) {
                AnonymousClass006.A1R(linkedHashMapA0j2, entryA0l);
            }
        }
        Map mapA0A = AGH.A0A(linkedHashMapA0j);
        C7384Etj.A0Y(mapA0A, 1);
        C7727FCd c7727FCdCreateObjectSet = AuraObjectSetUtilsKt.createObjectSet(context);
        EnumC7949FMf enumC7949FMf = EnumC7949FMf.A04;
        EnumC7948FMe enumC7948FMe = EnumC7948FMe.A04;
        EnumC7950FMg enumC7950FMg = EnumC7950FMg.A04;
        CdsBottomSheetDimmingBehaviour.Default r22 = CdsBottomSheetDimmingBehaviour.Default.A00;
        AnonymousClass5 anonymousClass5 = AnonymousClass5.INSTANCE;
        CdsOpenScreenCallerDismissCallback cdsOpenScreenCallerDismissCallback = new CdsOpenScreenCallerDismissCallback(new InterfaceC8011FPi() { // from class: com.facebook.aura.ccv.CcvBloksHelperKt.openAccountLinkingUpsellBloksScreen.6
            @Override // X.InterfaceC8011FPi
            public final void run(int i) {
                g0u.invoke(Integer.valueOf(i));
            }
        });
        EnumC7951FMh enumC7951FMh = FMd.A0Q;
        Integer num = C79.A0C;
        EnumC7951FMh enumC7951FMh2 = EnumC7951FMh.A06;
        HiG hiG = HiG.A02;
        FHL[] fhlArr = (FHL[]) Arrays.copyOf(new FHL[]{new FMd(hiG, hiG, anonymousClass5, null, null, r22, cdsOpenScreenCallerDismissCallback, enumC7951FMh2, null, EnumC7952FMi.A03, enumC7950FMg, enumC7949FMf, null, enumC7948FMe, null, num, null, null, 16542, false, false, true, true, false, false, false)}, 1);
        C7384Etj.A0Y(fhlArr, 2);
        int length = fhlArr.length;
        for (FHL fhl : fhlArr) {
            int iAK5 = fhl.AK5();
            if (iAK5 == 16542 || iAK5 == 22848) {
                int iAK52 = fhl.AK5();
                Integer numValueOf = Integer.valueOf(iAK52);
                LinkedHashMap linkedHashMapA02 = AGH.A02(linkedHashMapA0j2, AnonymousClass006.A10("__infra__container_config_id", numValueOf));
                FBN auraComponentQueryStoreProviderImpl = AuraComponentQueryStoreProviderImpl.getInstance(c7727FCdCreateObjectSet);
                C7384Etj.A0U(auraComponentQueryStoreProviderImpl);
                auraComponentQueryStoreProviderImpl.A0A.execute(new FBO(HlX.A03, auraComponentQueryStoreProviderImpl, null, "com.bloks.www.screen_query.BloksHatchAccountLinkingTrampolineScreenQuery", linkedHashMapA02, Collections.singleton("__infra__container_config_id"), 0L, true, true));
                BloksParseResult bloksParseResultA00 = C10535Hqe.A00.A00(context, fhl.AIw());
                C7384Etj.A0Y(bloksParseResultA00, 0);
                C0924AIa c0924AIa = new C0924AIa();
                c0924AIa.put("__infra__app_id", "com.bloks.www.screen_query.BloksHatchAccountLinkingTrampolineScreenQuery");
                c0924AIa.put("__infra__screen_id", String.valueOf(new SecureRandom().nextInt()));
                c0924AIa.put("__infra__cache_ttl", 0L);
                c0924AIa.put("__infra__enable_disk_cache", true);
                c0924AIa.put("__infra__ttrc_marker_id", 719983200);
                c0924AIa.put("__infra__ttrc_analytics_extras", null);
                C7933FLf c7933FLf = new C7933FLf(fhl, bloksParseResultA00, true, null, C0881AGi.A00, AGH.A02(AGH.A02(mapA0A, AIW.A0K(c0924AIa)), AnonymousClass006.A10("__infra__container_config_id", numValueOf)), null, false, false);
                FD3.A03.A02(context);
                if (iAK52 == 16542) {
                    AuraCdsScreenQueryNavigator.INSTANCE.openScreen(context, c7933FLf, c7727FCdCreateObjectSet, false);
                    return;
                } else {
                    if (iAK52 != 22848) {
                        throw AnonymousClass005.A0c(iAK52);
                    }
                    AuraBloksFullScreenContainerNavigator.INSTANCE.openScreen(context, c7933FLf, c7727FCdCreateObjectSet, false);
                    return;
                }
            }
        }
        ArrayList arrayListA11 = C60O.A11(length);
        for (FHL fhl2 : fhlArr) {
            C60Q.A1P(arrayListA11, fhl2.AK5());
        }
        throw BV8.A0m(") have a registered navigator in this host app.", C3cG.A0f(arrayListA11, "No matching container config found. None of the provided container config style IDs ("));
    }

    /* renamed from: com.facebook.aura.ccv.CcvBloksHelperKt$openAccountLinkingUpsellBloksScreen$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Integer, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            AnonymousClass005.A0w(num);
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
        }
    }

    public static /* synthetic */ void openAccountLinkingUpsellBloksScreen$default(Context context, HatchAccountLinkingTarget hatchAccountLinkingTarget, boolean z, Function0 function0, G0U g0u, int i, Object obj) {
        boolean zA1O = AnonymousClass005.A1O(i, z);
        if ((i & 8) != 0) {
            function0 = AnonymousClass1.INSTANCE;
        }
        if ((i & 16) != 0) {
            g0u = AnonymousClass2.INSTANCE;
        }
        openAccountLinkingUpsellBloksScreen(context, hatchAccountLinkingTarget, zA1O, function0, g0u);
    }

    /* renamed from: com.facebook.aura.ccv.CcvBloksHelperKt$openAccountLinkingUpsellBloksScreen$5, reason: invalid class name */
    public final class AnonymousClass5 {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public final void onCreateView(Context context, FrameLayout frameLayout, FHO fho) {
        }
    }
}
