package com.facebook.aura.conversation.repo;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BQG;
import X.C3UX;
import X.C7BY;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.network.stefi.AuraStefiClient;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchFeedbackApi {
    public static final HatchFeedbackApi INSTANCE = new HatchFeedbackApi();

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchFeedbackApi$submitFeedback$2", f = "HatchFeedbackApi.kt", l = {72}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchFeedbackApi$submitFeedback$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $comment;
        public final /* synthetic */ String $hatcheryVmId;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ String $tags;
        public final /* synthetic */ int $thumbScore;
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, int i, String str2, String str3, String str4, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$messageId = str;
            this.$thumbScore = i;
            this.$hatcheryVmId = str2;
            this.$tags = str3;
            this.$comment = str4;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$messageId, this.$thumbScore, this.$hatcheryVmId, this.$tags, this.$comment, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1604executeStefiRequestWithjLovISM;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (!AuraStefiClient.INSTANCE.hasAuth()) {
                    CFK.A04(HatchFeedbackApiKt.TAG, "submitFeedback failed: missing access token");
                    return false;
                }
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                StefiHatchPath.Feedback feedback = StefiHatchPath.Feedback.INSTANCE;
                String str = this.$messageId;
                int i2 = this.$thumbScore;
                String str2 = this.$hatcheryVmId;
                String strA17 = null;
                if (str2 == null || C7BY.A0j(str2)) {
                    str2 = null;
                }
                String str3 = this.$tags;
                if (str3 == null || str3.length() <= 0) {
                    str3 = null;
                }
                String str4 = this.$comment;
                if (str4 != null && str4.length() > 0) {
                    strA17 = BQG.A17(str4, 5000);
                }
                StefiFeedbackJson stefiFeedbackJson = new StefiFeedbackJson(str, i2, HatchFeedbackApiKt.STEFI_SOURCE, "android", str2, str3, strA17);
                RequestType requestType = RequestType.POST;
                C9jH c9jHA0E = AGH.A0E();
                HatchFeedbackApi$submitFeedback$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 hatchFeedbackApi$submitFeedback$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 = HatchFeedbackApi$submitFeedback$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE;
                HatchFeedbackApi$submitFeedback$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 hatchFeedbackApi$submitFeedback$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 = HatchFeedbackApi$submitFeedback$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = 1;
                this.I$1 = 0;
                this.label = 1;
                objM1604executeStefiRequestWithjLovISM = hatchHttpApi.m1604executeStefiRequestWithjLovISM(hatchFeedbackApi$submitFeedback$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1, hatchFeedbackApi$submitFeedback$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2, false, feedback, stefiFeedbackJson, requestType, c9jHA0E, true, null, false, null, this);
                if (objM1604executeStefiRequestWithjLovISM == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1604executeStefiRequestWithjLovISM = AnonymousClass002.A0j(obj);
            }
            if (HsJ.A00(objM1604executeStefiRequestWithjLovISM) == null) {
                return Boolean.valueOf(((StefiFeedbackResponseJson) objM1604executeStefiRequestWithjLovISM).accepted);
            }
            return false;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object submitFeedback(String str, int i, String str2, String str3, String str4, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, i, str4, str2, str3, null));
    }
}
