package com.facebook.aura.nodes.cards;

import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HxE;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.cards.HatchMessagingCardKt$HatchMessagingCard$1$1", f = "HatchMessagingCard.kt", l = {80}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchMessagingCardKt$HatchMessagingCard$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MessagingCardData $data;
    public final /* synthetic */ MutableState<Boolean> $isLoaded$delegate;
    public final /* synthetic */ MutableState<MessagingApp> $messagingApp$delegate;
    public final /* synthetic */ MutableState<List<ContactInfo>> $resolvedContacts$delegate;
    public Object L$0;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.nodes.cards.HatchMessagingCardKt$HatchMessagingCard$1$1$1", f = "HatchMessagingCard.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.cards.HatchMessagingCardKt$HatchMessagingCard$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HxE<? extends MessagingApp, ? extends List<? extends ContactInfo>>>, Object> {
        public final /* synthetic */ Context $appContext;
        public final /* synthetic */ MessagingCardData $data;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, MessagingCardData messagingCardData, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$appContext = context;
            this.$data = messagingCardData;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$appContext, this.$data, htJ);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HxE<? extends MessagingApp, ? extends List<? extends ContactInfo>>> htJ) {
            return invoke2(c3ux, (HtJ<? super HxE<MessagingApp, ? extends List<ContactInfo>>>) htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws PackageManager.NameNotFoundException {
            ContactInfo contactInfoResolveContact;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            Context context = this.$appContext;
            C7384Etj.A0X(context);
            MessagingApp messagingAppResolveDefaultMessagingApp = CallingCardResolverKt.resolveDefaultMessagingApp(context);
            AHD<MessagingCardRecipient> ahd = this.$data.recipients;
            Context context2 = this.$appContext;
            ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
            for (MessagingCardRecipient messagingCardRecipient : ahd) {
                if (messagingCardRecipient.contactName == null) {
                    C7384Etj.A0X(context2);
                    contactInfoResolveContact = CallingCardResolverKt.resolveContact(context2, messagingCardRecipient.address);
                } else {
                    contactInfoResolveContact = null;
                }
                arrayListA0i.add(contactInfoResolveContact);
            }
            return C3cG.A0r(messagingAppResolveDefaultMessagingApp, arrayListA0i);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super HxE<MessagingApp, ? extends List<ContactInfo>>> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessagingCardKt$HatchMessagingCard$1$1(Context context, MessagingCardData messagingCardData, MutableState<MessagingApp> mutableState, MutableState<List<ContactInfo>> mutableState2, MutableState<Boolean> mutableState3, HtJ<? super HatchMessagingCardKt$HatchMessagingCard$1$1> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$data = messagingCardData;
        this.$messagingApp$delegate = mutableState;
        this.$resolvedContacts$delegate = mutableState2;
        this.$isLoaded$delegate = mutableState3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessagingCardKt$HatchMessagingCard$1$1(this.$context, this.$data, this.$messagingApp$delegate, this.$resolvedContacts$delegate, this.$isLoaded$delegate, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Context applicationContext = this.$context.getApplicationContext();
            C78T c78tA0y = AnonymousClass001.A0y();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(applicationContext, this.$data, null);
            this.L$0 = null;
            this.label = 1;
            obj = GAo.A00(this, c78tA0y, anonymousClass1);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        HxE hxE = (HxE) obj;
        A a = hxE.first;
        B b = hxE.second;
        this.$messagingApp$delegate.Af8(a);
        this.$resolvedContacts$delegate.Af8(b);
        MutableState.A09(true, this.$isLoaded$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchMessagingCardKt$HatchMessagingCard$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
