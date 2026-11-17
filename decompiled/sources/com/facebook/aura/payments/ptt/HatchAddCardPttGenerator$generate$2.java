package com.facebook.aura.payments.ptt;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C7Bm;
import X.CFK;
import X.EW3;
import X.EW4;
import X.EWD;
import X.EWH;
import X.EnumC10460Hji;
import X.G0V;
import X.GBL;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.bloks.fbpay.pttprovider.AuraPttManagerProvider;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.payments.ptt.HatchAddCardPttGenerator$generate$2", f = "HatchAddCardPttGenerator.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchAddCardPttGenerator$generate$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends String>>, Object> {
    public final /* synthetic */ String $cardNumber;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $expiryMonth;
    public final /* synthetic */ String $expiryYear;
    public final /* synthetic */ String $paymentType;
    public final /* synthetic */ Long $productId;
    public final /* synthetic */ String $securityCode;
    public final /* synthetic */ String $serverKeyId;
    public final /* synthetic */ List<String> $trustChain;
    public final /* synthetic */ String $uplSessionId;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAddCardPttGenerator$generate$2(Context context, String str, String str2, String str3, List<String> list, String str4, String str5, String str6, String str7, Long l, HtJ<? super HatchAddCardPttGenerator$generate$2> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$paymentType = str;
        this.$uplSessionId = str2;
        this.$serverKeyId = str3;
        this.$trustChain = list;
        this.$cardNumber = str4;
        this.$securityCode = str5;
        this.$expiryMonth = str6;
        this.$expiryYear = str7;
        this.$productId = l;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAddCardPttGenerator$generate$2(this.$context, this.$paymentType, this.$uplSessionId, this.$serverKeyId, this.$trustChain, this.$cardNumber, this.$securityCode, this.$expiryMonth, this.$expiryYear, this.$productId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return obj;
        }
        Hwg.A00(obj);
        Context context = this.$context;
        String str = this.$paymentType;
        String str2 = this.$uplSessionId;
        String str3 = this.$serverKeyId;
        List<String> list = this.$trustChain;
        String str4 = this.$cardNumber;
        String str5 = this.$securityCode;
        String str6 = this.$expiryMonth;
        String str7 = this.$expiryYear;
        Long l = this.$productId;
        this.L$0 = context;
        this.L$1 = str;
        this.L$2 = str2;
        this.L$3 = str3;
        this.L$4 = list;
        this.L$5 = str4;
        this.L$6 = str5;
        this.L$7 = str6;
        this.L$8 = str7;
        this.L$9 = l;
        this.label = 1;
        final GBL gblA04 = C7Bm.A04(this);
        Context contextA0I = AnonymousClass001.A0I(context);
        EWD pTTManager = AuraPttManagerProvider.INSTANCE.getPTTManager();
        C7384Etj.A0U(pTTManager);
        Map mapA0n = C3cH.A0n(HatchAddCardPttGeneratorKt.KEY_EXPIRY_YEAR, str7, C3cG.A0r(HatchAddCardPttGeneratorKt.KEY_CREDIT_CARD, str4), C3cG.A0r("csc", str5), C3cG.A0r(HatchAddCardPttGeneratorKt.KEY_EXPIRY_MONTH, str6));
        Set<String> set = HatchAddCardPttGeneratorKt.SENSITIVE_KEYS;
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(set));
        for (String str8 : set) {
            linkedHashMapA15.put(str8, str8);
        }
        EW3.A00(new EW4(contextA0I, new EWH() { // from class: com.facebook.aura.payments.ptt.HatchAddCardPttGenerator$generate$2$1$2
            @Override // X.EWH
            public void onPttError(Throwable th, Integer num, Boolean bool) {
                C7384Etj.A0Y(th, 0);
                CFK.A08(HatchAddCardPttGeneratorKt.TAG, "PTT generation failed", th);
                if (gblA04.isActive()) {
                    gblA04.resumeWith(C3cG.A0t(C3cG.A0s(th)));
                }
            }

            @Override // X.EWH
            public void onPttSigned(String str9) {
                C7384Etj.A0Y(str9, 0);
                if (gblA04.isActive()) {
                    gblA04.resumeWith(C3cG.A0t(str9));
                }
            }
        }, pTTManager, l, str, str2, null, null, str3, "ADD_CARD", null, list, null, mapA0n, linkedHashMapA15, false));
        Object objA0F = gblA04.A0F();
        return objA0F == enumC10460Hji ? enumC10460Hji : objA0F;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<String>> htJ) {
        return ((HatchAddCardPttGenerator$generate$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends String>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<String>>) htJ);
    }
}
