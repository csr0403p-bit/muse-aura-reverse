package com.facebook.aura.conversation.view;

import X.ADq;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.C00r;
import X.C1161Act;
import X.C1BO;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.HxE;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.view.HatchConversationScrollingKt;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1", f = "HatchConversation.kt", l = {618, 619, 627, 634, 635, 643, 718, 730, 744, 756, 785, 796, 798, 799, 800}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$17$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
    public final /* synthetic */ MutableState<String> $bottomFollowBaselineUserKey$delegate;
    public final /* synthetic */ C00r $bottomRevealRequestGeneration$delegate;
    public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;
    public final /* synthetic */ C1BO<Integer> $currentRowCount$delegate;
    public final /* synthetic */ MutableState<Boolean> $followingPostApprovalResponse$delegate;
    public final /* synthetic */ C00r $handledBottomRevealRequestGeneration$delegate;
    public final /* synthetic */ boolean $hasTrailingAgentPermissionRequest;
    public final /* synthetic */ int $highlightedMessageIndex;
    public final /* synthetic */ boolean $isDeeplinkRequest;
    public final /* synthetic */ Function0<Boolean> $isEditingWidgetField;
    public final /* synthetic */ MutableState<Boolean> $keepBottomUntilNextUserTurn$delegate;
    public final /* synthetic */ MutableState<String> $lastAutoScrollContentKey$delegate;
    public final /* synthetic */ HatchConversationListItem $lastItem;
    public final /* synthetic */ String $lastItemKey;
    public final /* synthetic */ HatchConversationListItem.Message $lastMessage;
    public final /* synthetic */ HatchMessageUiModel $lastMessageModel;
    public final /* synthetic */ Set<String> $latestResponseContentIds;
    public final /* synthetic */ String $latestResponseContentSignature;
    public final /* synthetic */ String $latestResponseEndKey;
    public final /* synthetic */ boolean $latestResponseHasRichContent;
    public final /* synthetic */ boolean $latestResponseIsStreaming;
    public final /* synthetic */ ADq $latestResponseRange;
    public final /* synthetic */ String $latestResponseStartKey;
    public final /* synthetic */ String $latestUserMessageKey;
    public final /* synthetic */ AHD<HatchConversationListItem> $listItems;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ MutableState<String> $pinEligibleResponseStartKey$delegate;
    public final /* synthetic */ MutableState<String> $postApprovalBoundaryContentSignature$delegate;
    public final /* synthetic */ MutableState<String> $postApprovalBoundaryMessageKey$delegate;
    public final /* synthetic */ MutableState<String> $previousAutoScrollItemKey$delegate;
    public final /* synthetic */ MutableState<String> $previousAutoScrollMessageKey$delegate;
    public final /* synthetic */ MutableState<Boolean> $previousHadTrailingAgentPermissionRequest$delegate;
    public final /* synthetic */ MutableState<Boolean> $previousIsStreaming$delegate;
    public final /* synthetic */ MutableState<Set<String>> $previousResponseContentIds$delegate;
    public final /* synthetic */ MutableState<String> $previousResponseContentSignature$delegate;
    public final /* synthetic */ MutableState<String> $topPinnedResponseStartKey$delegate;
    public int I$0;
    public int I$1;
    public int I$10;
    public int I$11;
    public int I$12;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public int I$7;
    public int I$8;
    public int I$9;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$13;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public boolean Z$0;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<HxE<? extends Integer, ? extends Integer>> {
        public final /* synthetic */ C1BO<Integer> $currentRowCount$delegate;
        public final /* synthetic */ LazyListState $listState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState, C1BO<Integer> c1bo) {
            super(0);
            this.$listState = lazyListState;
            this.$currentRowCount$delegate = c1bo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final HxE<? extends Integer, ? extends Integer> invoke() {
            return AnonymousClass002.A0p(Integer.valueOf(((C1161Act) this.$listState.A04()).A05), C1BO.A02(this.$currentRowCount$delegate));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC7559F3s implements Function0<Integer> {
        public final /* synthetic */ C1BO<Integer> $currentRowCount$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(C1BO<Integer> c1bo) {
            super(0);
            this.$currentRowCount$delegate = c1bo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(C1BO.A02(this.$currentRowCount$delegate));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1$2", f = "HatchConversation.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<HxE<? extends Integer, ? extends Integer>, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(HxE<? extends Integer, ? extends Integer> hxE, HtJ<? super Boolean> htJ) {
            return invoke2((HxE<Integer, Integer>) hxE, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Object r1 = r2.L$0
                X.HxE r1 = (X.HxE) r1
                int r0 = r2.label
                if (r0 != 0) goto L22
                X.Hwg.A00(r3)
                A r0 = r1.first
                int r2 = X.AnonymousClass001.A0F(r0)
                B r0 = r1.second
                int r1 = X.AnonymousClass001.A0F(r0)
                if (r2 <= 0) goto L1c
                r0 = 1
                if (r2 == r1) goto L1d
            L1c:
                r0 = 0
            L1d:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L22:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HxE<Integer, Integer> hxE, HtJ<? super Boolean> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = hxE;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<HxE<? extends Integer, ? extends Integer>> {
        public final /* synthetic */ C1BO<Integer> $currentRowCount$delegate;
        public final /* synthetic */ LazyListState $listState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LazyListState lazyListState, C1BO<Integer> c1bo) {
            super(0);
            this.$listState = lazyListState;
            this.$currentRowCount$delegate = c1bo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final HxE<? extends Integer, ? extends Integer> invoke() {
            return AnonymousClass002.A0p(Integer.valueOf(((C1161Act) this.$listState.A04()).A05), C1BO.A02(this.$currentRowCount$delegate));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1$4", f = "HatchConversation.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<HxE<? extends Integer, ? extends Integer>, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(htJ);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(HxE<? extends Integer, ? extends Integer> hxE, HtJ<? super Boolean> htJ) {
            return invoke2((HxE<Integer, Integer>) hxE, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Object r1 = r2.L$0
                X.HxE r1 = (X.HxE) r1
                int r0 = r2.label
                if (r0 != 0) goto L22
                X.Hwg.A00(r3)
                A r0 = r1.first
                int r2 = X.AnonymousClass001.A0F(r0)
                B r0 = r1.second
                int r1 = X.AnonymousClass001.A0F(r0)
                if (r2 <= 0) goto L1c
                r0 = 1
                if (r2 == r1) goto L1d
            L1c:
                r0 = 0
            L1d:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L22:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HxE<Integer, Integer> hxE, HtJ<? super Boolean> htJ) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(htJ);
            anonymousClass4.L$0 = hxE;
            return anonymousClass4.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0U<String, Integer> {
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
        public AnonymousClass7(C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo) {
            super(1);
            this.$currentItems$delegate = c1bo;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements Function0<Integer> {
        public final /* synthetic */ C1BO<Integer> $currentRowCount$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(C1BO<Integer> c1bo) {
            super(0);
            this.$currentRowCount$delegate = c1bo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(C1BO.A02(this.$currentRowCount$delegate));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0U<String, Integer> {
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
        public AnonymousClass9(C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo) {
            super(1);
            this.$currentItems$delegate = c1bo;
        }
    }

    public static final Object invokeSuspend$followBottom(LazyListState lazyListState, String str, boolean z, Function0<Boolean> function0, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo, C1BO<Integer> c1bo2, long j, HtJ<? super Unit> htJ) {
        Object objPinToBottomWhileSettling = HatchConversationScrollingKt.pinToBottomWhileSettling(lazyListState, j, null, str, new HatchConversationKt$HatchConversation$17$1$followBottom$2(c1bo), new HatchConversationKt$HatchConversation$17$1$followBottom$3(c1bo2), true, z, HatchConversationScrollingKt.C114564.INSTANCE, HatchConversationScrollingKt.AnonymousClass5.INSTANCE, function0, htJ);
        return objPinToBottomWhileSettling != EnumC10460Hji.A02 ? Unit.INSTANCE : objPinToBottomWhileSettling;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invokeSuspend$followLatestContent(java.lang.String r17, java.lang.String r18, androidx.compose.foundation.lazy.LazyListState r19, java.lang.String r20, kotlin.jvm.functions.Function0<java.lang.Boolean> r21, kotlin.jvm.functions.Function0<kotlin.Unit> r22, kotlin.jvm.functions.Function0<java.lang.Boolean> r23, X.C1BO<? extends X.AHD<? extends com.facebook.aura.conversation.viewmodel.HatchConversationListItem>> r24, X.C1BO<java.lang.Integer> r25, long r26, boolean r28, X.HtJ<? super kotlin.Unit> r29) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1.invokeSuspend$followLatestContent(java.lang.String, java.lang.String, androidx.compose.foundation.lazy.LazyListState, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.1BO, X.1BO, long, boolean, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object invokeSuspend$followLatestContent$default(String str, String str2, LazyListState lazyListState, String str3, Function0 function0, Function0 function02, Function0 function03, C1BO c1bo, C1BO c1bo2, long j, boolean z, HtJ htJ, int i, Object obj) {
        if ((i & 1024) != 0) {
            z = false;
        }
        return invokeSuspend$followLatestContent(str, str2, lazyListState, str3, function0, function02, function03, c1bo, c1bo2, j, z, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationKt$HatchConversation$17$1(this.$hasTrailingAgentPermissionRequest, this.$lastMessage, this.$latestResponseContentSignature, this.$lastMessageModel, this.$latestUserMessageKey, this.$highlightedMessageIndex, this.$isDeeplinkRequest, this.$lastItemKey, this.$latestResponseIsStreaming, this.$listState, this.$latestResponseContentIds, this.$latestResponseHasRichContent, this.$listItems, this.$latestResponseRange, this.$latestResponseStartKey, this.$latestResponseEndKey, this.$lastItem, this.$isEditingWidgetField, this.$previousHadTrailingAgentPermissionRequest$delegate, this.$postApprovalBoundaryMessageKey$delegate, this.$postApprovalBoundaryContentSignature$delegate, this.$followingPostApprovalResponse$delegate, this.$keepBottomUntilNextUserTurn$delegate, this.$bottomFollowBaselineUserKey$delegate, this.$autoFollowEnabled$delegate, this.$currentRowCount$delegate, this.$bottomRevealRequestGeneration$delegate, this.$handledBottomRevealRequestGeneration$delegate, this.$lastAutoScrollContentKey$delegate, this.$previousAutoScrollItemKey$delegate, this.$previousAutoScrollMessageKey$delegate, this.$previousIsStreaming$delegate, this.$previousResponseContentSignature$delegate, this.$previousResponseContentIds$delegate, this.$currentItems$delegate, this.$topPinnedResponseStartKey$delegate, this.$pinEligibleResponseStartKey$delegate, htJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationKt$HatchConversation$17$1(boolean z, HatchConversationListItem.Message message, String str, HatchMessageUiModel hatchMessageUiModel, String str2, int i, boolean z2, String str3, boolean z3, LazyListState lazyListState, Set<String> set, boolean z4, AHD<? extends HatchConversationListItem> ahd, ADq aDq, String str4, String str5, HatchConversationListItem hatchConversationListItem, Function0<Boolean> function0, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<Boolean> mutableState4, MutableState<Boolean> mutableState5, MutableState<String> mutableState6, MutableState<Boolean> mutableState7, C1BO<Integer> c1bo, C00r c00r, C00r c00r2, MutableState<String> mutableState8, MutableState<String> mutableState9, MutableState<String> mutableState10, MutableState<Boolean> mutableState11, MutableState<String> mutableState12, MutableState<Set<String>> mutableState13, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo2, MutableState<String> mutableState14, MutableState<String> mutableState15, HtJ<? super HatchConversationKt$HatchConversation$17$1> htJ) {
        super(2, htJ);
        this.$hasTrailingAgentPermissionRequest = z;
        this.$lastMessage = message;
        this.$latestResponseContentSignature = str;
        this.$lastMessageModel = hatchMessageUiModel;
        this.$latestUserMessageKey = str2;
        this.$highlightedMessageIndex = i;
        this.$isDeeplinkRequest = z2;
        this.$lastItemKey = str3;
        this.$latestResponseIsStreaming = z3;
        this.$listState = lazyListState;
        this.$latestResponseContentIds = set;
        this.$latestResponseHasRichContent = z4;
        this.$listItems = ahd;
        this.$latestResponseRange = aDq;
        this.$latestResponseStartKey = str4;
        this.$latestResponseEndKey = str5;
        this.$lastItem = hatchConversationListItem;
        this.$isEditingWidgetField = function0;
        this.$previousHadTrailingAgentPermissionRequest$delegate = mutableState;
        this.$postApprovalBoundaryMessageKey$delegate = mutableState2;
        this.$postApprovalBoundaryContentSignature$delegate = mutableState3;
        this.$followingPostApprovalResponse$delegate = mutableState4;
        this.$keepBottomUntilNextUserTurn$delegate = mutableState5;
        this.$bottomFollowBaselineUserKey$delegate = mutableState6;
        this.$autoFollowEnabled$delegate = mutableState7;
        this.$currentRowCount$delegate = c1bo;
        this.$bottomRevealRequestGeneration$delegate = c00r;
        this.$handledBottomRevealRequestGeneration$delegate = c00r2;
        this.$lastAutoScrollContentKey$delegate = mutableState8;
        this.$previousAutoScrollItemKey$delegate = mutableState9;
        this.$previousAutoScrollMessageKey$delegate = mutableState10;
        this.$previousIsStreaming$delegate = mutableState11;
        this.$previousResponseContentSignature$delegate = mutableState12;
        this.$previousResponseContentIds$delegate = mutableState13;
        this.$currentItems$delegate = c1bo2;
        this.$topPinnedResponseStartKey$delegate = mutableState14;
        this.$pinEligibleResponseStartKey$delegate = mutableState15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0329 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0332 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x067f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x051a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6 A[PHI: r5
  0x00c6: PHI (r5v13 boolean) = (r5v8 boolean), (r5v14 boolean) binds: [B:52:0x00c4, B:50:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca A[PHI: r5
  0x00ca: PHI (r5v12 boolean) = (r5v16 boolean), (r5v17 boolean), (r5v18 boolean) binds: [B:62:0x0126, B:64:0x0129, B:54:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124 A[PHI: r5
  0x0124: PHI (r5v9 boolean) = (r5v15 boolean), (r5v29 boolean) binds: [B:52:0x00c4, B:54:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0222  */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instructions count: 1726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$17$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationKt$HatchConversation$17$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
