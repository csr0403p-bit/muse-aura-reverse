package com.facebook.aura.nodes.cards;

import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchMessagingCardKt$HatchMessagingCard$2$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MessagingCardData $data;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.nodes.cards.HatchMessagingCardKt$HatchMessagingCard$2$3$1$1", f = "HatchMessagingCard.kt", l = {145}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.cards.HatchMessagingCardKt$HatchMessagingCard$2$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<String> $addresses;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MessagingCardData $data;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, AbstractC3358CGz abstractC3358CGz, List<String> list, MessagingCardData messagingCardData, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$userSession = abstractC3358CGz;
            this.$addresses = list;
            this.$data = messagingCardData;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$userSession, this.$addresses, this.$data, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                Context context = this.$context;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                List<String> list = this.$addresses;
                MessagingCardData messagingCardData = this.$data;
                String str = messagingCardData.body;
                AHD<MessagingCardAttachment> ahd = messagingCardData.attachments;
                this.label = 1;
                if (HatchMessagingCardKt.openMessagingWithAttachments(context, abstractC3358CGz, list, str, ahd, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessagingCardKt$HatchMessagingCard$2$3$1(MessagingCardData messagingCardData, Context context, C3UX c3ux, AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$data = messagingCardData;
        this.$context = context;
        this.$scope = c3ux;
        this.$userSession = abstractC3358CGz;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AHD<MessagingCardRecipient> ahd = this.$data.recipients;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(((MessagingCardRecipient) it.next()).address);
        }
        if (this.$data.attachments.isEmpty()) {
            HatchMessagingCardKt.openMessaging(this.$context, arrayListA0i, this.$data.body);
        } else {
            AnonymousClass001.A1J(new AnonymousClass1(this.$context, this.$userSession, arrayListA0i, this.$data, null), this.$scope);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
