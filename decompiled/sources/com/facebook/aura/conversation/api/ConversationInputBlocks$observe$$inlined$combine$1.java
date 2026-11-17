package com.facebook.aura.conversation.api;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.EnumC10460Hji;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class ConversationInputBlocks$observe$$inlined$combine$1 implements C20Q<Boolean> {
    public final /* synthetic */ C20Q[] $flowArray$inlined;

    @DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationInputBlocks$observe$$inlined$combine$1", f = "ConversationInputBlocks.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.conversation.api.ConversationInputBlocks$observe$$inlined$combine$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationInputBlocks$observe$$inlined$combine$1.this.collect(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationInputBlocks$observe$$inlined$combine$1$3", f = "ConversationInputBlocks.kt", l = {288}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.api.ConversationInputBlocks$observe$$inlined$combine$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0W<C20Z<? super Boolean>, Boolean[], HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public Object L$2;
        public int label;

        public AnonymousClass3(HtJ htJ) {
            super(3, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C20Z c20z = (C20Z) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                Boolean[] boolArr = (Boolean[]) objArr;
                int length = boolArr.length;
                boolean z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (boolArr[i2].booleanValue()) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (c20z.emit(boolValueOf, this) == enumC10460Hji) {
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

        @Override // X.G0W
        public final Object invoke(C20Z<? super Boolean> c20z, Boolean[] boolArr, HtJ<? super Unit> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ);
            anonymousClass3.L$0 = c20z;
            anonymousClass3.L$1 = boolArr;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConversationInputBlocks$observe$$inlined$combine$1(C20Q[] c20qArr) {
        this.$flowArray$inlined = c20qArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super java.lang.Boolean> r8, X.HtJ r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.conversation.api.ConversationInputBlocks$observe$$inlined$combine$1.AnonymousClass1
            if (r0 == 0) goto L42
            r6 = r9
            com.facebook.aura.conversation.api.ConversationInputBlocks$observe$$inlined$combine$1$1 r6 = (com.facebook.aura.conversation.api.ConversationInputBlocks$observe$$inlined$combine$1.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L23
            if (r0 != r4) goto L48
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L23:
            X.Hwg.A00(r1)
            X.20Q[] r3 = r7.$flowArray$inlined
            com.facebook.aura.conversation.api.ConversationInputBlocks$observe$$inlined$combine$1$2 r2 = new com.facebook.aura.conversation.api.ConversationInputBlocks$observe$$inlined$combine$1$2
            r2.<init>()
            r1 = 0
            com.facebook.aura.conversation.api.ConversationInputBlocks$observe$$inlined$combine$1$3 r0 = new com.facebook.aura.conversation.api.ConversationInputBlocks$observe$$inlined$combine$1$3
            r0.<init>(r1)
            r6.L$0 = r1
            r6.L$1 = r1
            r6.L$2 = r1
            r6.label = r4
            java.lang.Object r0 = X.C4vq.A00(r6, r2, r0, r8, r3)
            if (r0 != r5) goto L20
            return r5
        L42:
            com.facebook.aura.conversation.api.ConversationInputBlocks$observe$$inlined$combine$1$1 r6 = new com.facebook.aura.conversation.api.ConversationInputBlocks$observe$$inlined$combine$1$1
            r6.<init>(r9)
            goto L12
        L48:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.api.ConversationInputBlocks$observe$$inlined$combine$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
