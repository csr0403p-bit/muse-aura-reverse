package com.facebook.aura.conversation.view;

import X.ADq;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C1BO;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import X.HxE;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1", f = "HatchConversation.kt", l = {846}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$18$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
    public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;
    public final /* synthetic */ C1BO<Integer> $currentRowCount$delegate;
    public final /* synthetic */ MutableState<Boolean> $followingPostApprovalResponse$delegate;
    public final /* synthetic */ Function0<Boolean> $isEditingWidgetField;
    public final /* synthetic */ boolean $isLatestResponseStreaming;
    public final /* synthetic */ String $latestResponseContentSignature;
    public final /* synthetic */ String $latestResponseEndKey;
    public final /* synthetic */ ADq $latestResponseRange;
    public final /* synthetic */ String $latestResponseStartKey;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ MutableState<String> $pinEligibleResponseStartKey$delegate;
    public final /* synthetic */ MutableState<String> $postApprovalBoundaryContentSignature$delegate;
    public final /* synthetic */ MutableState<String> $postApprovalBoundaryMessageKey$delegate;
    public final /* synthetic */ MutableState<String> $topPinnedResponseStartKey$delegate;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<HxE<? extends Integer, ? extends Integer>> {
        public final /* synthetic */ Function0<Boolean> $isEditingWidgetField;
        public final /* synthetic */ String $latestResponseEndKey;
        public final /* synthetic */ String $latestResponseStartKey;
        public final /* synthetic */ LazyListState $listState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState, String str, String str2, Function0<Boolean> function0) {
            super(0);
            this.$listState = lazyListState;
            this.$latestResponseStartKey = str;
            this.$latestResponseEndKey = str2;
            this.$isEditingWidgetField = function0;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.HxE<? extends java.lang.Integer, ? extends java.lang.Integer> invoke() {
            /*
                r10 = this;
                androidx.compose.foundation.lazy.LazyListState r0 = r10.$listState
                X.2A9 r1 = r0.A04()
                X.Act r1 = (X.C1161Act) r1
                int r0 = r1.A05
                java.util.List<X.Acs> r9 = r1.A0D
                java.lang.Object r3 = X.AbstractC0878AGe.A0I(r9)
                X.16C r3 = (X.C16C) r3
                r1 = 0
                java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
                if (r0 <= 0) goto L91
                if (r3 == 0) goto L91
                X.Acs r3 = (X.C1160Acs) r3
                int r2 = r3.A07
                int r0 = r0 + (-1)
                if (r2 != r0) goto L91
                int r5 = r3.A09
            L25:
                java.lang.String r3 = r10.$latestResponseStartKey
                if (r3 == 0) goto L7b
                java.lang.String r0 = r10.$latestResponseEndKey
                if (r0 == 0) goto L7b
                java.util.Iterator r2 = r9.iterator()
            L31:
                boolean r0 = r2.hasNext()
                r8 = 0
                if (r0 == 0) goto L8f
                java.lang.Object r7 = r2.next()
                r0 = r7
                X.16C r0 = (X.C16C) r0
                X.Acs r0 = (X.C1160Acs) r0
                java.lang.Object r0 = r0.A0B
                boolean r0 = X.C7384Etj.areEqual(r0, r3)
                if (r0 == 0) goto L31
            L49:
                X.16C r7 = (X.C16C) r7
                java.lang.String r4 = r10.$latestResponseEndKey
                java.util.Iterator r3 = r9.iterator()
            L51:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L69
                java.lang.Object r2 = r3.next()
                r0 = r2
                X.16C r0 = (X.C16C) r0
                X.Acs r0 = (X.C1160Acs) r0
                java.lang.Object r0 = r0.A0B
                boolean r0 = X.C7384Etj.areEqual(r0, r4)
                if (r0 == 0) goto L51
                r8 = r2
            L69:
                X.16C r8 = (X.C16C) r8
                if (r7 == 0) goto L89
                if (r8 == 0) goto L7b
                X.Acs r8 = (X.C1160Acs) r8
                int r1 = r8.A02
                int r0 = r8.A09
                int r1 = r1 + r0
                X.Acs r7 = (X.C1160Acs) r7
                int r0 = r7.A02
                int r1 = r1 - r0
            L7b:
                kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r10.$isEditingWidgetField
                boolean r0 = X.AnonymousClass003.A1Y(r0)
                if (r0 == 0) goto L93
                X.HxE r0 = new X.HxE
                r0.<init>(r6, r6)
                return r0
            L89:
                if (r8 == 0) goto L7b
                r1 = 2147483647(0x7fffffff, float:NaN)
                goto L7b
            L8f:
                r7 = r8
                goto L49
            L91:
                r5 = 0
                goto L25
            L93:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                X.HxE r0 = X.AnonymousClass002.A0p(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1.AnonymousClass1.invoke():X.HxE");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationKt$HatchConversation$18$1(MutableState<Boolean> mutableState, MutableState<String> mutableState2, LazyListState lazyListState, String str, String str2, Function0<Boolean> function0, boolean z, ADq aDq, String str3, MutableState<Boolean> mutableState3, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6, C1BO<Integer> c1bo2, HtJ<? super HatchConversationKt$HatchConversation$18$1> htJ) {
        super(2, htJ);
        this.$autoFollowEnabled$delegate = mutableState;
        this.$pinEligibleResponseStartKey$delegate = mutableState2;
        this.$listState = lazyListState;
        this.$latestResponseStartKey = str;
        this.$latestResponseEndKey = str2;
        this.$isEditingWidgetField = function0;
        this.$isLatestResponseStreaming = z;
        this.$latestResponseRange = aDq;
        this.$latestResponseContentSignature = str3;
        this.$followingPostApprovalResponse$delegate = mutableState3;
        this.$currentItems$delegate = c1bo;
        this.$postApprovalBoundaryMessageKey$delegate = mutableState4;
        this.$postApprovalBoundaryContentSignature$delegate = mutableState5;
        this.$topPinnedResponseStartKey$delegate = mutableState6;
        this.$currentRowCount$delegate = c1bo2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationKt$HatchConversation$18$1(this.$autoFollowEnabled$delegate, this.$pinEligibleResponseStartKey$delegate, this.$listState, this.$latestResponseStartKey, this.$latestResponseEndKey, this.$isEditingWidgetField, this.$isLatestResponseStreaming, this.$latestResponseRange, this.$latestResponseContentSignature, this.$followingPostApprovalResponse$delegate, this.$currentItems$delegate, this.$postApprovalBoundaryMessageKey$delegate, this.$postApprovalBoundaryContentSignature$delegate, this.$topPinnedResponseStartKey$delegate, this.$currentRowCount$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (MutableState.A0A((MutableState) this.$autoFollowEnabled$delegate)) {
                C20Q c20qA01 = GDB.A01(C6v3.A01(new AnonymousClass1(this.$listState, this.$latestResponseStartKey, this.$latestResponseEndKey, this.$isEditingWidgetField)));
                final boolean z = this.$isLatestResponseStreaming;
                final LazyListState lazyListState = this.$listState;
                final ADq aDq = this.$latestResponseRange;
                final String str = this.$latestResponseStartKey;
                final String str2 = this.$latestResponseContentSignature;
                final String str3 = this.$latestResponseEndKey;
                final Function0<Boolean> function0 = this.$isEditingWidgetField;
                final MutableState<Boolean> mutableState = this.$autoFollowEnabled$delegate;
                final MutableState<Boolean> mutableState2 = this.$followingPostApprovalResponse$delegate;
                final C1BO<AHD<HatchConversationListItem>> c1bo = this.$currentItems$delegate;
                final MutableState<String> mutableState3 = this.$postApprovalBoundaryMessageKey$delegate;
                final MutableState<String> mutableState4 = this.$postApprovalBoundaryContentSignature$delegate;
                final MutableState<String> mutableState5 = this.$pinEligibleResponseStartKey$delegate;
                final MutableState<String> mutableState6 = this.$topPinnedResponseStartKey$delegate;
                final C1BO<Integer> c1bo2 = this.$currentRowCount$delegate;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1.2

                    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1$2$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, Integer> {
                        public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;

                        @Override // X.G0U
                        public final Integer invoke(String str) {
                            C7384Etj.A0Y(str, 0);
                            Iterator itA09 = C1BO.A09(this.$currentItems$delegate);
                            int i = 0;
                            while (true) {
                                if (!itA09.hasNext()) {
                                    i = -1;
                                    break;
                                }
                                if (AnonymousClass007.A1P(str, itA09)) {
                                    break;
                                }
                                i++;
                            }
                            return Integer.valueOf(i);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public AnonymousClass1(C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo) {
                            super(1);
                            this.$currentItems$delegate = c1bo;
                        }
                    }

                    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1$2$2, reason: invalid class name and collision with other inner class name */
                    public final class C00992 extends AbstractC7559F3s implements Function0<Integer> {
                        public final /* synthetic */ C1BO<Integer> $currentRowCount$delegate;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00992(C1BO<Integer> c1bo) {
                            super(0);
                            this.$currentRowCount$delegate = c1bo;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Integer invoke() {
                            return Integer.valueOf(C1BO.A02(this.$currentRowCount$delegate));
                        }
                    }

                    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1$2$3, reason: invalid class name */
                    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Boolean> {
                        public final /* synthetic */ String $responseStartKey;
                        public final /* synthetic */ MutableState<String> $topPinnedResponseStartKey$delegate;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(String str, MutableState<String> mutableState) {
                            super(0);
                            this.$responseStartKey = str;
                            this.$topPinnedResponseStartKey$delegate = mutableState;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(!MutableState.A0B(this.$topPinnedResponseStartKey$delegate, this.$responseStartKey));
                        }
                    }

                    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1$2$4, reason: invalid class name */
                    public final class AnonymousClass4 extends AbstractC7559F3s implements Function0<Unit> {
                        public final /* synthetic */ String $responseStartKey;
                        public final /* synthetic */ MutableState<String> $topPinnedResponseStartKey$delegate;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass4(String str, MutableState<String> mutableState) {
                            super(0);
                            this.$responseStartKey = str;
                            this.$topPinnedResponseStartKey$delegate = mutableState;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            this.$topPinnedResponseStartKey$delegate.Af8(this.$responseStartKey);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HxE<Integer, Integer>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
                    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(X.HxE<java.lang.Integer, java.lang.Integer> r14, X.HtJ<? super kotlin.Unit> r15) {
                        /*
                            r13 = this;
                            A r0 = r14.first
                            int r3 = X.AnonymousClass001.A0F(r0)
                            B r0 = r14.second
                            int r0 = X.AnonymousClass001.A0F(r0)
                            if (r3 != 0) goto L10
                            if (r0 == 0) goto L57
                        L10:
                            boolean r0 = r1
                            if (r0 != 0) goto L57
                            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r8
                            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
                            if (r0 == 0) goto L57
                            androidx.compose.foundation.lazy.LazyListState r0 = r2
                            X.2A9 r4 = r0.A04()
                            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r9
                            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
                            if (r0 == 0) goto Lc7
                            X.1BO<X.AHD<com.facebook.aura.conversation.viewmodel.HatchConversationListItem>> r0 = r10
                            java.lang.Object r2 = r0.getValue()
                            java.util.List r2 = (java.util.List) r2
                            X.ADq r1 = r3
                            androidx.compose.runtime.MutableState<java.lang.String> r0 = r11
                            java.lang.String r0 = androidx.compose.runtime.MutableState.A05(r0)
                            java.lang.String r5 = com.facebook.aura.conversation.view.HatchConversationScrollingKt.responseStartKeyAfterBoundary(r2, r1, r0)
                        L3e:
                            r2 = 1
                            if (r5 != 0) goto L4c
                            java.lang.String r1 = r5
                            androidx.compose.runtime.MutableState<java.lang.String> r0 = r12
                            boolean r0 = androidx.compose.runtime.MutableState.A0B(r0, r1)
                            r1 = 0
                            if (r0 != 0) goto L4d
                        L4c:
                            r1 = 1
                        L4d:
                            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r9
                            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
                            if (r0 == 0) goto L5a
                            if (r1 != 0) goto L5a
                        L57:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        L5a:
                            r14 = r15
                            if (r5 == 0) goto L72
                            java.lang.String r0 = r6
                            if (r0 == 0) goto L72
                            boolean r0 = com.facebook.aura.conversation.view.HatchConversationScrollingKt.contentRangeFits(r4, r5, r0)
                            if (r0 == 0) goto L7f
                        L67:
                            androidx.compose.foundation.lazy.LazyListState r0 = r2
                            java.lang.Object r0 = com.facebook.aura.conversation.view.HatchConversationScrollingKt.scrollToBottom(r0, r15)
                        L6d:
                            X.Hji r1 = X.EnumC10460Hji.A02
                            if (r0 != r1) goto L57
                            return r0
                        L72:
                            int r0 = com.facebook.aura.conversation.view.HatchConversationScrollingKt.visibleContentHeight(r4)
                            if (r0 <= 0) goto L7d
                            if (r2 > r3) goto L7d
                            if (r3 > r0) goto L7d
                            goto L67
                        L7d:
                            if (r5 == 0) goto L57
                        L7f:
                            java.lang.String r0 = r6
                            if (r0 == 0) goto L57
                            androidx.compose.runtime.MutableState<java.lang.String> r0 = r13
                            java.lang.Object r0 = r0.getValue()
                            boolean r0 = r5.equals(r0)
                            if (r0 == 0) goto L57
                            androidx.compose.runtime.MutableState<java.lang.String> r0 = r14
                            java.lang.Object r0 = r0.getValue()
                            boolean r0 = r5.equals(r0)
                            if (r0 != 0) goto L57
                            androidx.compose.foundation.lazy.LazyListState r2 = r2
                            java.lang.String r6 = r6
                            X.1BO<X.AHD<com.facebook.aura.conversation.viewmodel.HatchConversationListItem>> r0 = r10
                            com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1$2$1 r7 = new com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1$2$1
                            r7.<init>(r0)
                            X.1BO<java.lang.Integer> r0 = r15
                            com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1$2$2 r8 = new com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1$2$2
                            r8.<init>(r0)
                            androidx.compose.runtime.MutableState<java.lang.String> r0 = r14
                            com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1$2$3 r11 = new com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1$2$3
                            r11.<init>(r5, r0)
                            com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1$2$4 r12 = new com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1$2$4
                            r12.<init>(r5, r0)
                            kotlin.jvm.functions.Function0<java.lang.Boolean> r13 = r7
                            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                            r9 = 0
                            r10 = r9
                            java.lang.Object r0 = com.facebook.aura.conversation.view.HatchConversationScrollingKt.pinToBottomWhileSettling(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                            goto L6d
                        Lc7:
                            java.lang.String r5 = r4
                            goto L3e
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$18$1.AnonymousClass2.emit(X.HxE, X.HtJ):java.lang.Object");
                    }
                };
                this.label = 1;
                if (c20qA01.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                this.$pinEligibleResponseStartKey$delegate.Af8(null);
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
        return ((HatchConversationKt$HatchConversation$18$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
