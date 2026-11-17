package com.facebook.aura.settings.support;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C0881AGi;
import X.C3UX;
import X.C3cG;
import X.C7BY;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.network.transport.HatchMultipartPart;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchContactSupportApi {
    public static final int $stable = 0;
    public static final HatchContactSupportApi INSTANCE = new HatchContactSupportApi();

    @DebugMetadata(c = "com.facebook.aura.settings.support.HatchContactSupportApi$fetchTopics$2", f = "HatchContactSupportApi.kt", l = {119}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportApi$fetchTopics$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends HatchSupportTopicOption>>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends HatchSupportTopicOption>> htJ) {
            return invoke2(c3ux, (HtJ<? super List<HatchSupportTopicOption>>) htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1596executeBodylessStefiRequestWithtZkwj4A;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                StefiHatchPath.HelpTicketTopics helpTicketTopics = StefiHatchPath.HelpTicketTopics.INSTANCE;
                RequestType requestType = RequestType.GET;
                C9jH c9jHA0E = AGH.A0E();
                HatchContactSupportApi$fetchTopics$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 hatchContactSupportApi$fetchTopics$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 = HatchContactSupportApi$fetchTopics$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                objM1596executeBodylessStefiRequestWithtZkwj4A = hatchHttpApi.m1596executeBodylessStefiRequestWithtZkwj4A(hatchContactSupportApi$fetchTopics$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1, false, helpTicketTopics, requestType, null, null, c9jHA0E, c9jHA0E, this);
                if (objM1596executeBodylessStefiRequestWithtZkwj4A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1596executeBodylessStefiRequestWithtZkwj4A = AnonymousClass001.A0q(obj);
            }
            if (HsJ.A00(objM1596executeBodylessStefiRequestWithtZkwj4A) != null) {
                return C0881AGi.A00;
            }
            List<HelpTicketTopicJson> list = ((HelpTicketTopicsResponseJson) objM1596executeBodylessStefiRequestWithtZkwj4A).topics;
            ArrayList arrayList = new ArrayList();
            for (HelpTicketTopicJson helpTicketTopicJson : list) {
                HelpTicketTopicJson helpTicketTopicJson2 = helpTicketTopicJson;
                if (!C7BY.A0j(helpTicketTopicJson2.slug)) {
                    AnonymousClass006.A1F(helpTicketTopicJson2.display_name, helpTicketTopicJson, arrayList);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                AnonymousClass006.A1P(((HelpTicketTopicJson) obj2).slug, obj2, hashSet, arrayList2);
            }
            ArrayList arrayListA0i = AnonymousClass003.A0i(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(((HelpTicketTopicJson) it.next()).toDomain());
            }
            return arrayListA0i;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super List<HatchSupportTopicOption>> htJ) {
            return new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9 A[LOOP:0: B:24:0x00b3->B:26:0x00b9, LOOP_END] */
    /* renamed from: submitWithAttachments-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1985submitWithAttachmentsBWLJW6A(android.content.Context r15, com.facebook.aura.settings.support.HelpTicketRequestJson r16, java.util.List<? extends android.net.Uri> r17, X.HtJ<? super X.HsJ<com.facebook.aura.settings.support.HelpTicketResponseJson>> r18) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.support.HatchContactSupportApi.m1985submitWithAttachmentsBWLJW6A(android.content.Context, com.facebook.aura.settings.support.HelpTicketRequestJson, java.util.List, X.HtJ):java.lang.Object");
    }

    private final HatchMultipartPart formField(String str, String str2) {
        return new HatchMultipartPart(str, null, "text/plain", C3cG.A1S(str2));
    }

    public final Object fetchTopics(HtJ<? super List<HatchSupportTopicOption>> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(null));
    }

    public final Object submitTicket$fbandroid_express_aura_java_com_facebook_aura_settings_support_support(Context context, HelpTicketRequestJson helpTicketRequestJson, List<? extends Uri> list, HtJ<? super String> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new HatchContactSupportApi$submitTicket$2(list, helpTicketRequestJson, context, null));
    }
}
