package com.facebook.aura.iap.iac;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BV4;
import X.BV5;
import X.C3341CFl;
import X.C3UX;
import X.C5179DbY;
import X.C7384Etj;
import X.C7545F1h;
import X.C7Bm;
import X.C9xo;
import X.CQD;
import X.CQG;
import X.DYI;
import X.EnumC10460Hji;
import X.EnumC3451CNw;
import X.G0V;
import X.GBL;
import X.Hon;
import X.HtJ;
import X.Hwg;
import X.InterfaceC5107DYf;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.graphql.AuraGraphQLService;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.iap.iac.AuraIacBottomSheetLauncherKt$IacSandboxSheet$1$1", f = "AuraIacBottomSheetLauncher.kt", l = {162}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class AuraIacBottomSheetLauncherKt$IacSandboxSheet$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<C9xo> $display$delegate;
    public final /* synthetic */ String $quoteId;
    public final /* synthetic */ MutableState<Boolean> $resolved$delegate;
    public final /* synthetic */ Hon $session;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraIacBottomSheetLauncherKt$IacSandboxSheet$1$1(String str, Hon hon, MutableState<C9xo> mutableState, MutableState<Boolean> mutableState2, HtJ<? super AuraIacBottomSheetLauncherKt$IacSandboxSheet$1$1> htJ) {
        super(2, htJ);
        this.$quoteId = str;
        this.$session = hon;
        this.$display$delegate = mutableState;
        this.$resolved$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraIacBottomSheetLauncherKt$IacSandboxSheet$1$1(this.$quoteId, this.$session, this.$display$delegate, this.$resolved$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Exception {
        MutableState mutableState;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            mutableState = this.$display$delegate;
            String str = this.$quoteId;
            if (str == null) {
                obj = null;
            } else {
                this.L$0 = mutableState;
                this.label = 1;
                final GBL gblA04 = C7Bm.A04(this);
                try {
                    Object objA0d = BV5.A0d("create", C7545F1h.class);
                    C7384Etj.A0Z(objA0d, "null cannot be cast to non-null type com.facebook.payments.dcp.xapp.billingclient.impl.iac.gql.IACQuoteDisplayQuery.BuilderForInput");
                    C5179DbY c5179DbY = (C5179DbY) objA0d;
                    C3341CFl c3341CFlA03 = GraphQlCallInput.A02.A03();
                    C3341CFl.A00(c3341CFlA03, str, "quote_id");
                    c5179DbY.A01.A00.A04().A0E(c3341CFlA03, "input");
                    c5179DbY.A00 = true;
                    DYI dyiBuild = c5179DbY.build();
                    InterfaceC5107DYf interfaceC5107DYfIapInstance = AuraGraphQLService.INSTANCE.iapInstance();
                    EnumC3451CNw enumC3451CNw = EnumC3451CNw.A01;
                    CQD.A01(new CQG() { // from class: X.9xu
                        public static String A00(C9YX c9yx, int i2) {
                            String strAIJ = c9yx.AIJ(i2);
                            return strAIJ == null ? "" : strAIJ;
                        }

                        @Override // X.CQG
                        public final void onFailure(Throwable th) {
                            gblA04.resumeWith(null);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.CQG
                        public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                            A7N a7n;
                            A7O a7oAIK;
                            C9xt c9xt;
                            C9xk c9xk;
                            F1G f1g = (F1G) obj2;
                            if (f1g != null && (a7n = (A7N) ((CPX) f1g).A01) != null && (a7oAIK = a7n.innerData.AIK(-1439782733)) != null) {
                                String strAIJ = a7oAIK.AIJ(1014375387);
                                String strAIJ2 = a7oAIK.AIJ(-1076422708);
                                if (strAIJ != null && strAIJ2 != null) {
                                    Hm1<C9xo> hm1 = gblA04;
                                    boolean zADk = a7oAIK.ADk(-392828398);
                                    String strAIJ3 = a7oAIK.AIJ(1443130849);
                                    String strAIJ4 = a7oAIK.AIJ(1938137093);
                                    A7O a7oAIK2 = a7oAIK.AIK(-760853921);
                                    if (a7oAIK2 != null) {
                                        c9xt = new C9xt(A00(a7oAIK2, -343792976), A00(a7oAIK2, -736306455), A00(a7oAIK2, 86892619), a7oAIK2.AIJ(-572622813), a7oAIK2.AIJ(672884350), a7oAIK2.AIJ(862619849), a7oAIK2.ADm(-1009059040), a7oAIK2.ADk(1269138439), a7oAIK2.ADk(-186723620), a7oAIK2.ADk(594689765), a7oAIK2.ADk(68080391));
                                    } else {
                                        c9xt = null;
                                    }
                                    A7O a7oAIK3 = a7oAIK.AIK(3059573);
                                    if (a7oAIK3 != null) {
                                        String strA00 = A00(a7oAIK3, 1013718904);
                                        String strA002 = A00(a7oAIK3, -1933694682);
                                        String strA003 = A00(a7oAIK3, -569911610);
                                        String strA004 = A00(a7oAIK3, -866529550);
                                        String strA005 = A00(a7oAIK3, -955839745);
                                        String strA006 = A00(a7oAIK3, -352848621);
                                        String strA007 = A00(a7oAIK3, 1658258512);
                                        String strA008 = A00(a7oAIK3, -1886701398);
                                        String strA009 = A00(a7oAIK3, 254997621);
                                        String strA0010 = A00(a7oAIK3, 1670262757);
                                        String strA0011 = A00(a7oAIK3, -1821811026);
                                        String strA0012 = A00(a7oAIK3, -197846388);
                                        ImmutableList<? extends A7O> immutableListAJc = a7oAIK3.AJc(-1125528592);
                                        ArrayList arrayListA0m = AnonymousClass002.A0m(immutableListAJc);
                                        Iterator<? extends A7O> it = immutableListAJc.iterator();
                                        while (it.hasNext()) {
                                            arrayListA0m.add(new C9yA(C8j5.A0S(it)));
                                        }
                                        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayListA0m);
                                        ArrayList arrayListA0m2 = AnonymousClass002.A0m(immutableListCopyOf);
                                        Iterator<E> it2 = immutableListCopyOf.iterator();
                                        while (it2.hasNext()) {
                                            A7N a7n2 = (A7N) it2.next();
                                            arrayListA0m2.add(new C9xv(A00(a7n2.innerData, 102727412), a7n2.innerData.ADm(111972721)));
                                        }
                                        ImmutableList<? extends A7O> immutableListAJc2 = a7oAIK3.AJc(-867921924);
                                        ArrayList arrayListA0m3 = AnonymousClass002.A0m(immutableListAJc2);
                                        Iterator<? extends A7O> it3 = immutableListAJc2.iterator();
                                        while (it3.hasNext()) {
                                            arrayListA0m3.add(new C9y9(C8j5.A0S(it3)));
                                        }
                                        ImmutableList immutableListCopyOf2 = ImmutableList.copyOf((Collection) arrayListA0m3);
                                        ArrayList arrayListA0m4 = AnonymousClass002.A0m(immutableListCopyOf2);
                                        Iterator<E> it4 = immutableListCopyOf2.iterator();
                                        while (it4.hasNext()) {
                                            A7N a7n3 = (A7N) it4.next();
                                            arrayListA0m4.add(new C9xv(A00(a7n3.innerData, 102727412), a7n3.innerData.ADm(111972721)));
                                        }
                                        List listA0U = AbstractC0878AGe.A0U(a7oAIK3.AJb(374221035));
                                        String strAIJ5 = a7oAIK3.AIJ(-1035824923);
                                        String strA0013 = A00(a7oAIK3, -516891852);
                                        String strA0014 = A00(a7oAIK3, -333968214);
                                        A7O a7oAIK4 = a7oAIK3.AIK(-760853921);
                                        c9xk = new C9xk(a7oAIK4 != null ? new C9xn(A00(a7oAIK4, -1906828704), A00(a7oAIK4, -1973576233), A00(a7oAIK4, 510360315), A00(a7oAIK4, 669782621), A00(a7oAIK4, 705039280), A00(a7oAIK4, -1728768343), A00(a7oAIK4, 1941146147), A00(a7oAIK4, -1897334347), a7oAIK4.AIJ(216133196), A00(a7oAIK4, -1040805242), a7oAIK4.AIJ(1770788808)) : null, strA00, strA002, strA003, strA004, strA005, strA006, strA007, strA008, strA009, strA0010, strA0011, strA0012, strAIJ5, strA0013, strA0014, arrayListA0m2, arrayListA0m4, listA0U);
                                    } else {
                                        c9xk = null;
                                    }
                                    hm1.resumeWith(new C9xo(c9xk, c9xt, strAIJ, strAIJ2, strAIJ3, strAIJ4, zADk));
                                    return;
                                }
                            }
                            gblA04.resumeWith(null);
                        }
                    }, interfaceC5107DYfIapInstance.asFuture(dyiBuild, enumC3451CNw), enumC3451CNw);
                    obj = gblA04.A0F();
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } catch (Exception e) {
                    if ((e instanceof ClassNotFoundException) || (e instanceof IllegalAccessException) || (e instanceof InstantiationException) || (e instanceof InvocationTargetException) || (e instanceof NoSuchMethodException)) {
                        throw BV4.A0e(e);
                    }
                    throw e;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            mutableState = (MutableState) this.L$0;
            Hwg.A00(obj);
        }
        mutableState.Af8(obj);
        MutableState.A09(true, this.$resolved$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraIacBottomSheetLauncherKt$IacSandboxSheet$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
