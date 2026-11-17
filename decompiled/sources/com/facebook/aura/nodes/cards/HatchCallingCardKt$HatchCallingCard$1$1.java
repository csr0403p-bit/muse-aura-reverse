package com.facebook.aura.nodes.cards;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.cards.HatchCallingCardKt$HatchCallingCard$1$1", f = "HatchCallingCard.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchCallingCardKt$HatchCallingCard$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<ContactInfo> $contact$delegate;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ CallingCardData $data;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.nodes.cards.HatchCallingCardKt$HatchCallingCard$1$1$1", f = "HatchCallingCard.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.cards.HatchCallingCardKt$HatchCallingCard$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<ContactInfo> $contact$delegate;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ CallingCardData $data;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, CallingCardData callingCardData, MutableState<ContactInfo> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$data = callingCardData;
            this.$contact$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$data, this.$contact$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            this.$contact$delegate.Af8(CallingCardResolverKt.resolveContact(this.$context, this.$data.phoneNumber));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCallingCardKt$HatchCallingCard$1$1(CallingCardData callingCardData, Context context, MutableState<ContactInfo> mutableState, HtJ<? super HatchCallingCardKt$HatchCallingCard$1$1> htJ) {
        super(2, htJ);
        this.$data = callingCardData;
        this.$context = context;
        this.$contact$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCallingCardKt$HatchCallingCard$1$1(this.$data, this.$context, this.$contact$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$data.contactName == null) {
                C78T c78tA0y = AnonymousClass001.A0y();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$data, this.$contact$delegate, null);
                this.label = 1;
                if (GAo.A00(this, c78tA0y, anonymousClass1) == enumC10460Hji) {
                    return enumC10460Hji;
                }
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
        return ((HatchCallingCardKt$HatchCallingCard$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
