package com.facebook.aura.conversation.view;

import X.ADq;
import X.AHD;
import X.AIX;
import X.AIY;
import X.ATD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BNt;
import X.BQG;
import X.C05663ul;
import X.C0881AGi;
import X.C1160Acs;
import X.C1161Act;
import X.C16C;
import X.C1er;
import X.C20Z;
import X.C2A9;
import X.C3UX;
import X.C6v3;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.BubbleGroupPosition;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.conversation.viewmodel.HatchRenderSegment;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import com.facebook.aura.model.HatchContentViewModelData;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchConversationScrollingKt {
    public static final int BOTTOM_TOLERANCE_PX = 1;
    public static final String RECORD_SEPARATOR = "\u001e";
    public static final long SCROLL_TO_BOTTOM_PILL_SHOW_DELAY_MS = 250;
    public static final int TRAILING_REACTION_WINDOW = 24;
    public static final String UNIT_SEPARATOR = "\u001f";

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$ConversationHistoryLoader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $didInitialScroll;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ Function0<Unit> $onLoadHistory;
        public final /* synthetic */ HatchConversationUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LazyListState lazyListState, HatchConversationUiState hatchConversationUiState, boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.$listState = lazyListState;
            this.$uiState = hatchConversationUiState;
            this.$didInitialScroll = z;
            this.$onLoadHistory = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationScrollingKt.ConversationHistoryLoader(this.$listState, this.$uiState, this.$didInitialScroll, this.$onLoadHistory, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$ViewportMessageIdTracker$2, reason: invalid class name and case insensitive filesystem */
    public final class C114512 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AHD<HatchConversationListItem> $items;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ HatchConversationUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114512(LazyListState lazyListState, HatchConversationUiState hatchConversationUiState, AHD<? extends HatchConversationListItem> ahd, int i) {
            super(2);
            this.$listState = lazyListState;
            this.$uiState = hatchConversationUiState;
            this.$items = ahd;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationScrollingKt.ViewportMessageIdTracker(this.$listState, this.$uiState, this.$items, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScrollingKt", f = "HatchConversationScrolling.kt", l = {367, 368}, m = "awaitScrollRest", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$awaitScrollRest$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationScrollingKt.awaitScrollRest(null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$awaitScrollRest$2, reason: invalid class name and case insensitive filesystem */
    public final class C114522 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ LazyListState $this_awaitScrollRest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114522(LazyListState lazyListState) {
            super(0);
            this.$this_awaitScrollRest = lazyListState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$this_awaitScrollRest.AOz());
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScrollingKt$awaitScrollRest$3", f = "HatchConversationScrolling.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$awaitScrollRest$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ);
            anonymousClass3.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass3;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(!z);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass3) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScrollingKt", f = "HatchConversationScrolling.kt", l = {433}, m = "pinToBottomWhileSettling", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$pinToBottomWhileSettling$1, reason: invalid class name and case insensitive filesystem */
    public final class C114531 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationScrollingKt.pinToBottomWhileSettling(null, 0L, null, null, null, null, false, false, null, null, null, this);
        }

        public C114531(HtJ<? super C114531> htJ) {
            super(htJ);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$pinToBottomWhileSettling$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScrollingKt$pinToBottomWhileSettling$6", f = "HatchConversationScrolling.kt", l = {510}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$pinToBottomWhileSettling$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Function0<Boolean> $allowPinTop;
        public final /* synthetic */ String $bottomAnchorKey;
        public final /* synthetic */ Function0<Integer> $currentItemCount;
        public final /* synthetic */ boolean $followShrinkage;
        public final /* synthetic */ boolean $forceBottom;
        public final /* synthetic */ Function0<Boolean> $hold;
        public final /* synthetic */ G0U<String, Integer> $indexOfKey;
        public final /* synthetic */ Function0<Unit> $onPinTop;
        public final /* synthetic */ LazyListState $this_pinToBottomWhileSettling;
        public final /* synthetic */ String $topAnchorKey;
        public int label;

        /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$pinToBottomWhileSettling$6$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<BottomPinState> {
            public final /* synthetic */ Function0<Boolean> $allowPinTop;
            public final /* synthetic */ String $bottomAnchorKey;
            public final /* synthetic */ Function0<Integer> $currentItemCount;
            public final /* synthetic */ boolean $followShrinkage;
            public final /* synthetic */ boolean $forceBottom;
            public final /* synthetic */ Function0<Boolean> $hold;
            public final /* synthetic */ G0U<String, Integer> $indexOfKey;
            public final /* synthetic */ LazyListState $this_pinToBottomWhileSettling;
            public final /* synthetic */ String $topAnchorKey;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(LazyListState lazyListState, Function0<Boolean> function0, boolean z, boolean z2, String str, G0U<? super String, Integer> g0u, Function0<Integer> function02, String str2, Function0<Boolean> function03) {
                super(0);
                this.$this_pinToBottomWhileSettling = lazyListState;
                this.$hold = function0;
                this.$followShrinkage = z;
                this.$forceBottom = z2;
                this.$bottomAnchorKey = str;
                this.$indexOfKey = g0u;
                this.$currentItemCount = function02;
                this.$topAnchorKey = str2;
                this.$allowPinTop = function03;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x01b8, code lost:
            
                if (r12 == false) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x01ba, code lost:
            
                r0 = com.facebook.aura.conversation.view.BottomPinAction.FOLLOW_BOTTOM;
             */
            /* JADX WARN: Code restructure failed: missing block: B:104:0x01bc, code lost:
            
                if (r1 == null) goto L106;
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x01be, code lost:
            
                if (r13 != false) goto L107;
             */
            /* JADX WARN: Code restructure failed: missing block: B:106:0x01c0, code lost:
            
                r3 = Integer.MAX_VALUE;
             */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x0171  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x017c  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x018a  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x0190  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.facebook.aura.conversation.view.BottomPinState invoke() {
                /*
                    Method dump skipped, instructions count: 462
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScrollingKt.AnonymousClass6.AnonymousClass1.invoke():com.facebook.aura.conversation.view.BottomPinState");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(LazyListState lazyListState, Function0<Boolean> function0, boolean z, boolean z2, String str, G0U<? super String, Integer> g0u, Function0<Integer> function02, String str2, Function0<Boolean> function03, Function0<Unit> function04, HtJ<? super AnonymousClass6> htJ) {
            super(2, htJ);
            this.$this_pinToBottomWhileSettling = lazyListState;
            this.$hold = function0;
            this.$followShrinkage = z;
            this.$forceBottom = z2;
            this.$bottomAnchorKey = str;
            this.$indexOfKey = g0u;
            this.$currentItemCount = function02;
            this.$topAnchorKey = str2;
            this.$allowPinTop = function03;
            this.$onPinTop = function04;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass6(this.$this_pinToBottomWhileSettling, this.$hold, this.$followShrinkage, this.$forceBottom, this.$bottomAnchorKey, this.$indexOfKey, this.$currentItemCount, this.$topAnchorKey, this.$allowPinTop, this.$onPinTop, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$this_pinToBottomWhileSettling, this.$hold, this.$followShrinkage, this.$forceBottom, this.$bottomAnchorKey, this.$indexOfKey, this.$currentItemCount, this.$topAnchorKey, this.$allowPinTop));
                final String str = this.$topAnchorKey;
                final G0U<String, Integer> g0u = this.$indexOfKey;
                final Function0<Unit> function0 = this.$onPinTop;
                final LazyListState lazyListState = this.$this_pinToBottomWhileSettling;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchConversationScrollingKt.pinToBottomWhileSettling.6.2

                    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$pinToBottomWhileSettling$6$2$WhenMappings */
                    public abstract /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[BottomPinAction.values().length];
                            try {
                                AnonymousClass002.A13(BottomPinAction.PIN_TOP, iArr);
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                AnonymousClass002.A14(BottomPinAction.FOLLOW_BOTTOM, iArr);
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                AnonymousClass002.A15(BottomPinAction.IDLE, iArr);
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((BottomPinState) obj2, (HtJ<? super Unit>) htJ);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[RETURN] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(com.facebook.aura.conversation.view.BottomPinState r4, X.HtJ<? super kotlin.Unit> r5) {
                        /*
                            r3 = this;
                            com.facebook.aura.conversation.view.BottomPinAction r0 = r4.action
                            int r1 = r0.ordinal()
                            r0 = 1
                            if (r1 == r0) goto L15
                            r0 = 2
                            if (r1 == r0) goto L32
                            r0 = 0
                            if (r1 == r0) goto L3d
                            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                            r0.<init>()
                            throw r0
                        L15:
                            java.lang.String r1 = r1
                            if (r1 == 0) goto L3d
                            X.G0U<java.lang.String, java.lang.Integer> r0 = r2
                            java.lang.Object r0 = r0.invoke(r1)
                            int r2 = X.AnonymousClass001.A0F(r0)
                            if (r2 < 0) goto L3d
                            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r3
                            r0.invoke()
                            androidx.compose.foundation.lazy.LazyListState r1 = r4
                            r0 = 0
                            java.lang.Object r1 = r1.A05(r2, r0, r5)
                            goto L38
                        L32:
                            androidx.compose.foundation.lazy.LazyListState r0 = r4
                            java.lang.Object r1 = com.facebook.aura.conversation.view.HatchConversationScrollingKt.scrollToBottom(r0, r5)
                        L38:
                            X.Hji r0 = X.EnumC10460Hji.A02
                            if (r1 != r0) goto L3d
                            return r1
                        L3d:
                            kotlin.Unit r1 = kotlin.Unit.INSTANCE
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScrollingKt.AnonymousClass6.AnonymousClass2.emit(com.facebook.aura.conversation.view.BottomPinState, X.HtJ):java.lang.Object");
                    }
                };
                this.label = 1;
                if (c05663ulA01.collect(c20z, this) == enumC10460Hji) {
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
            return ((AnonymousClass6) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScrollingKt", f = "HatchConversationScrolling.kt", l = {107, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 114, 116}, m = "scrollToAndHighlight", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$scrollToAndHighlight$1, reason: invalid class name and case insensitive filesystem */
    public final class C114571 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationScrollingKt.scrollToAndHighlight(0, null, null, null, null, this);
        }

        public C114571(HtJ<? super C114571> htJ) {
            super(htJ);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$scrollToAndHighlight$2, reason: invalid class name and case insensitive filesystem */
    public final class C114582 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ LazyListState $listState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114582(LazyListState lazyListState) {
            super(0);
            this.$listState = lazyListState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$listState.AOz());
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScrollingKt$scrollToAndHighlight$3", f = "HatchConversationScrolling.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$scrollToAndHighlight$3, reason: invalid class name and case insensitive filesystem */
    public final class C114593 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public C114593(HtJ<? super C114593> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C114593 c114593 = new C114593(htJ);
            c114593.Z$0 = AnonymousClass001.A1X(obj);
            return c114593;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(!z);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
            return ((C114593) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScrollingKt", f = "HatchConversationScrolling.kt", l = {392, 397, 401}, m = "scrollToBottom", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$scrollToBottom$1, reason: invalid class name and case insensitive filesystem */
    public final class C114601 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationScrollingKt.scrollToBottom(null, this);
        }

        public C114601(HtJ<? super C114601> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConversationHistoryLoader(androidx.compose.foundation.lazy.LazyListState r15, com.facebook.aura.conversation.viewmodel.HatchConversationUiState r16, boolean r17, kotlin.jvm.functions.Function0<kotlin.Unit> r18, X.BFM r19, int r20) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScrollingKt.ConversationHistoryLoader(androidx.compose.foundation.lazy.LazyListState, com.facebook.aura.conversation.viewmodel.HatchConversationUiState, boolean, kotlin.jvm.functions.Function0, X.BFM, int):void");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    public static final boolean contentRangeFits(C2A9 c2a9, String str, String str2) {
        C1160Acs c1160Acs;
        C1160Acs next;
        ?? A1Z = AnonymousClass005.A1Z(c2a9, str, str2);
        int iVisibleContentHeight = visibleContentHeight(c2a9);
        if (iVisibleContentHeight > 0) {
            List<C1160Acs> list = ((C1161Act) c2a9).A0D;
            Iterator<C1160Acs> it = list.iterator();
            while (true) {
                c1160Acs = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.A0B, str)) {
                    break;
                }
            }
            C1160Acs c1160Acs2 = next;
            if (c1160Acs2 != null) {
                Iterator<C1160Acs> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C1160Acs next2 = it2.next();
                    if (C7384Etj.areEqual(next2.A0B, str2)) {
                        c1160Acs = next2;
                        break;
                    }
                }
                C1160Acs c1160Acs3 = c1160Acs;
                if (c1160Acs3 != null) {
                    C1160Acs c1160Acs4 = c1160Acs3;
                    int i = (c1160Acs4.A02 + c1160Acs4.A09) - c1160Acs2.A02;
                    if (A1Z <= i && i <= iVisibleContentHeight) {
                        return A1Z;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[EDGE_INSN: B:80:0x0116->B:41:0x0097 BREAK  A[LOOP:2: B:63:0x00e4->B:104:0x00e4], PHI: r10
  0x0097: PHI (r10v3 boolean) = (r10v0 boolean), (r10v4 boolean) binds: [B:40:0x0095, B:80:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4 A[PHI: r10
  0x00a4: PHI (r10v2 boolean) = (r10v0 boolean), (r10v3 boolean), (r10v3 boolean) binds: [B:40:0x0095, B:110:0x00a4, B:44:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.conversation.view.ConversationTailState conversationTailState(java.util.List<? extends com.facebook.aura.conversation.viewmodel.HatchConversationListItem> r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScrollingKt.conversationTailState(java.util.List):com.facebook.aura.conversation.view.ConversationTailState");
    }

    public static final boolean isAtBottom(LazyListState lazyListState) {
        C16C c16c;
        C7384Etj.A0Y(lazyListState, 0);
        C2A9 c2a9A04 = lazyListState.A04();
        C1161Act c1161Act = (C1161Act) c2a9A04;
        int i = c1161Act.A05;
        return i == 0 || (c16c = (C16C) AbstractC0878AGe.A0I(c1161Act.A0D)) == null || (((C1160Acs) c16c).A07 == i - 1 && bottomOverflowPx(c2a9A04, c16c) <= 1);
    }

    public static final boolean isFirstItemVisible(LazyListState lazyListState) {
        C7384Etj.A0Y(lazyListState, 0);
        C16C c16c = (C16C) AbstractC0878AGe.A0G(AnonymousClass003.A0j(lazyListState));
        return c16c != null && ((C1160Acs) c16c).A07 == 0;
    }

    public static final ADq latestAgentMessageGroupRange(List<? extends HatchConversationListItem> list, int i) {
        HatchConversationListItem.Message message;
        HatchMessageUiModel hatchMessageUiModel;
        HatchConversationListItem.Message message2;
        HatchMessageUiModel hatchMessageUiModel2;
        HatchConversationListItem.Message message3;
        HatchMessageUiModel hatchMessageUiModel3;
        C7384Etj.A0Y(list, 0);
        Object objA0A = AbstractC0878AGe.A0A(i, list);
        if (!(objA0A instanceof HatchConversationListItem.Message) || (message = (HatchConversationListItem.Message) objA0A) == null || (hatchMessageUiModel = message.message) == null || hatchMessageUiModel.role != HatchMessageRole.AGENT) {
            return null;
        }
        int i2 = i;
        while (i2 > 0) {
            Object objA0A2 = AbstractC0878AGe.A0A(i2, list);
            if (!(objA0A2 instanceof HatchConversationListItem.Message) || (message2 = (HatchConversationListItem.Message) objA0A2) == null || (hatchMessageUiModel2 = message2.message) == null || hatchMessageUiModel2.groupPosition == BubbleGroupPosition.STANDALONE || hatchMessageUiModel2.groupPosition == BubbleGroupPosition.FIRST) {
                break;
            }
            Object objA0A3 = AbstractC0878AGe.A0A(i2 - 1, list);
            if (!(objA0A3 instanceof HatchConversationListItem.Message) || (message3 = (HatchConversationListItem.Message) objA0A3) == null || (hatchMessageUiModel3 = message3.message) == null || hatchMessageUiModel3.role != HatchMessageRole.AGENT) {
                break;
            }
            i2--;
        }
        return new ADq(i2, i);
    }

    public static final String messageContentType(HatchMessageUiModel hatchMessageUiModel) {
        AHD<HatchWidgetPresentation> ahd;
        C7384Etj.A0Y(hatchMessageUiModel, 0);
        boolean zA1Z = AnonymousClass002.A1Z(hatchMessageUiModel.role, HatchMessageRole.AGENT);
        AHD<HatchContentViewModelData> ahd2 = hatchMessageUiModel.richContent;
        AHD<HatchWidget> ahd3 = hatchMessageUiModel.widgets;
        boolean z = ((ahd3 == null || ahd3.isEmpty()) && ((ahd = hatchMessageUiModel.presentations) == null || ahd.isEmpty()) && hatchMessageUiModel.widgetTokenIds.isEmpty()) ? false : true;
        AHD<HatchRenderSegment> ahd4 = hatchMessageUiModel.renderSegments;
        String strPrimaryContentType = (ahd4 == null || !(ahd4.isEmpty() ^ true)) ? z ? "widget" : (ahd2 == null || ahd2.isEmpty()) ? "text" : HatchMessageItemKt.primaryContentType(ahd2) : "transcript";
        ConcurrentHashMap<String, String> concurrentHashMap = zA1Z ? HatchMessageItemKt.AgentMessageContentTypes : HatchMessageItemKt.UserMessageContentTypes;
        String strPutIfAbsent = concurrentHashMap.get(strPrimaryContentType);
        if (strPutIfAbsent == null) {
            String strA0d = FGI.A0d("message:", zA1Z ? "agent" : "user", ":", strPrimaryContentType);
            strPutIfAbsent = concurrentHashMap.putIfAbsent(strPrimaryContentType, strA0d);
            if (strPutIfAbsent == null) {
                strPutIfAbsent = strA0d;
            }
        }
        return strPutIfAbsent;
    }

    public static final String responseContentSignature(List<? extends HatchConversationListItem> list, ADq aDq) {
        HatchConversationListItem.Message message;
        C7384Etj.A0Y(aDq, 1);
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = aDq.iterator();
        while (it.hasNext()) {
            Object objA15 = BQG.A15(sb, ((BNt) it).A00());
            if ((objA15 instanceof HatchConversationListItem.Message) && (message = (HatchConversationListItem.Message) objA15) != null) {
                sb.append(message.key);
                sb.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
                Iterable iterable = message.message.widgets;
                if (iterable == null) {
                    iterable = C0881AGi.A00;
                }
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    sb.append(((HatchWidget) it2.next()).widgetId);
                    sb.append(',');
                }
                sb.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
                Iterable iterable2 = message.message.presentations;
                if (iterable2 == null) {
                    iterable2 = C0881AGi.A00;
                }
                Iterator it3 = iterable2.iterator();
                while (it3.hasNext()) {
                    sb.append(((HatchWidgetPresentation) it3.next()).presentationId);
                    sb.append(',');
                }
                sb.append('|');
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String responseStartKeyAfterBoundary(java.util.List<? extends com.facebook.aura.conversation.viewmodel.HatchConversationListItem> r5, X.ADq r6, java.lang.String r7) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            r4 = 0
            if (r6 == 0) goto L50
            r3 = -1
            if (r7 == 0) goto L36
            java.util.Iterator r2 = r5.iterator()
            r1 = 0
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1e
            boolean r0 = X.AnonymousClass007.A1P(r7, r2)
            if (r0 != 0) goto L1f
            int r1 = r1 + 1
            goto Lf
        L1e:
            r1 = -1
        L1f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            int r2 = r6.A00
            int r1 = r6.A01
            int r0 = r0.intValue()
            if (r2 > r0) goto L32
            if (r0 > r1) goto L32
            int r3 = r0 + 1
            goto L39
        L32:
            if (r0 < 0) goto L39
            if (r0 >= r2) goto L39
        L36:
            int r2 = r6.A00
            r3 = r2
        L39:
            java.lang.Object r1 = X.AbstractC0878AGe.A0A(r3, r5)
            boolean r0 = r1 instanceof com.facebook.aura.conversation.viewmodel.HatchConversationListItem.Message
            if (r0 == 0) goto L50
            com.facebook.aura.conversation.viewmodel.HatchConversationListItem$Message r1 = (com.facebook.aura.conversation.viewmodel.HatchConversationListItem.Message) r1
            if (r1 == 0) goto L50
            java.lang.String r1 = r1.key
            if (r1 == 0) goto L50
            int r0 = r6.A01
            if (r3 > r0) goto L50
            if (r2 > r3) goto L50
            return r1
        L50:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScrollingKt.responseStartKeyAfterBoundary(java.util.List, X.ADq, java.lang.String):java.lang.String");
    }

    public static final float topSpacing(HatchConversationListItem hatchConversationListItem, int i) {
        C7384Etj.A0Y(hatchConversationListItem, 0);
        return ((hatchConversationListItem instanceof HatchConversationListItem.Message) && Arrays.asList(BubbleGroupPosition.MIDDLE, BubbleGroupPosition.LAST).contains(((HatchConversationListItem.Message) hatchConversationListItem).message.groupPosition)) ? 4.0f : 16.0f;
    }

    public static final String trailingReactionSignature(List<? extends HatchConversationListItem> list) {
        HatchConversationListItem.Message message;
        HatchMessageUiModel hatchMessageUiModel;
        AHD<String> ahd;
        C7384Etj.A0Y(list, 0);
        int size = list.size() - 24;
        if (size < 0) {
            size = 0;
        }
        ADq aDqA0C = ATD.A0C(size, list.size());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = aDqA0C.iterator();
        while (it.hasNext()) {
            Object objA0A = AbstractC0878AGe.A0A(((BNt) it).A00(), list);
            if ((objA0A instanceof HatchConversationListItem.Message) && (message = (HatchConversationListItem.Message) objA0A) != null && (hatchMessageUiModel = message.message) != null && (ahd = hatchMessageUiModel.reactions) != null && !ahd.isEmpty()) {
                arrayList.add(FGI.A0U(message.key, "\u001f", AbstractC0878AGe.A0L("\u001f", "", "", ahd, null)));
            }
        }
        return AbstractC0878AGe.A0L(RECORD_SEPARATOR, "", "", arrayList, null);
    }

    public static final int visibleContentHeight(C2A9 c2a9) {
        C7384Etj.A0Y(c2a9, 0);
        C1161Act c1161Act = (C1161Act) c2a9;
        int i = c1161Act.A06 - c1161Act.A02;
        int i2 = c1161Act.A07;
        return i - (i2 + (-i2));
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$awaitScrollRest$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            return AnonymousClass001.A0x(l);
        }

        public final void invoke(long j) {
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$pinToBottomWhileSettling$4, reason: invalid class name and case insensitive filesystem */
    public final class C114564 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final C114564 INSTANCE = new C114564();

        public C114564() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* renamed from: ScrollToBottomPill-Y0xEhic, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m573ScrollToBottomPillY0xEhic(androidx.compose.foundation.lazy.LazyListState r20, com.facebook.aura.conversation.viewmodel.HatchConversationUiState r21, long r22, long r24, kotlin.jvm.functions.Function0<kotlin.Unit> r26, X.BRg r27, X.BFM r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScrollingKt.m573ScrollToBottomPillY0xEhic(androidx.compose.foundation.lazy.LazyListState, com.facebook.aura.conversation.viewmodel.HatchConversationUiState, long, long, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005e -> B:12:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitScrollRest(androidx.compose.foundation.lazy.LazyListState r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof com.facebook.aura.conversation.view.HatchConversationScrollingKt.AnonymousClass1
            if (r0 == 0) goto L61
            r6 = r8
            com.facebook.aura.conversation.view.HatchConversationScrollingKt$awaitScrollRest$1 r6 = (com.facebook.aura.conversation.view.HatchConversationScrollingKt.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 == r3) goto L4d
            if (r0 != r4) goto L67
            java.lang.Object r7 = r6.L$0
            androidx.compose.foundation.lazy.LazyListState r7 = (androidx.compose.foundation.lazy.LazyListState) r7
            X.Hwg.A00(r1)
        L27:
            boolean r0 = r7.AOz()
            if (r0 != 0) goto L33
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L30:
            X.Hwg.A00(r1)
        L33:
            com.facebook.aura.conversation.view.HatchConversationScrollingKt$awaitScrollRest$2 r0 = new com.facebook.aura.conversation.view.HatchConversationScrollingKt$awaitScrollRest$2
            r0.<init>(r7)
            r2 = 0
            X.3ul r1 = X.C6v3.A01(r0)
            com.facebook.aura.conversation.view.HatchConversationScrollingKt$awaitScrollRest$3 r0 = new com.facebook.aura.conversation.view.HatchConversationScrollingKt$awaitScrollRest$3
            r0.<init>(r2)
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r6, r0, r1)
            if (r0 != r5) goto L54
            return r5
        L4d:
            java.lang.Object r7 = r6.L$0
            androidx.compose.foundation.lazy.LazyListState r7 = (androidx.compose.foundation.lazy.LazyListState) r7
            X.Hwg.A00(r1)
        L54:
            com.facebook.aura.conversation.view.HatchConversationScrollingKt$awaitScrollRest$4 r0 = com.facebook.aura.conversation.view.HatchConversationScrollingKt.AnonymousClass4.INSTANCE
            r6.L$0 = r7
            r6.label = r4
            java.lang.Object r0 = X.AvW.A01(r0, r6)
            if (r0 != r5) goto L27
            return r5
        L61:
            com.facebook.aura.conversation.view.HatchConversationScrollingKt$awaitScrollRest$1 r6 = new com.facebook.aura.conversation.view.HatchConversationScrollingKt$awaitScrollRest$1
            r6.<init>(r8)
            goto L12
        L67:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScrollingKt.awaitScrollRest(androidx.compose.foundation.lazy.LazyListState, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object pinToBottomWhileSettling(androidx.compose.foundation.lazy.LazyListState r17, long r18, java.lang.String r20, java.lang.String r21, X.G0U<? super java.lang.String, java.lang.Integer> r22, kotlin.jvm.functions.Function0<java.lang.Integer> r23, boolean r24, boolean r25, kotlin.jvm.functions.Function0<java.lang.Boolean> r26, kotlin.jvm.functions.Function0<kotlin.Unit> r27, kotlin.jvm.functions.Function0<java.lang.Boolean> r28, X.HtJ<? super kotlin.Unit> r29) {
        /*
            r3 = r29
            boolean r0 = r3 instanceof com.facebook.aura.conversation.view.HatchConversationScrollingKt.C114531
            if (r0 == 0) goto L65
            r5 = r3
            com.facebook.aura.conversation.view.HatchConversationScrollingKt$pinToBottomWhileSettling$1 r5 = (com.facebook.aura.conversation.view.HatchConversationScrollingKt.C114531) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r5.label = r2
        L14:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L25
            if (r0 != r1) goto L6b
            X.Hwg.A00(r2)
        L22:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L25:
            X.Hwg.A00(r2)
            r0 = 0
            com.facebook.aura.conversation.view.HatchConversationScrollingKt$pinToBottomWhileSettling$6 r6 = new com.facebook.aura.conversation.view.HatchConversationScrollingKt$pinToBottomWhileSettling$6
            r7 = r17
            r14 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r10 = r24
            r9 = r25
            r15 = r26
            r16 = r27
            r8 = r28
            r17 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.L$3 = r0
            r5.L$4 = r0
            r5.L$5 = r0
            r5.L$6 = r0
            r5.L$7 = r0
            r2 = r18
            r5.J$0 = r2
            r5.Z$0 = r10
            r5.Z$1 = r9
            r5.label = r1
            java.lang.Object r0 = X.GAX.A01(r5, r6, r2)
            if (r0 != r4) goto L22
            return r4
        L65:
            com.facebook.aura.conversation.view.HatchConversationScrollingKt$pinToBottomWhileSettling$1 r5 = new com.facebook.aura.conversation.view.HatchConversationScrollingKt$pinToBottomWhileSettling$1
            r5.<init>(r3)
            goto L14
        L6b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScrollingKt.pinToBottomWhileSettling(androidx.compose.foundation.lazy.LazyListState, long, java.lang.String, java.lang.String, X.G0U, kotlin.jvm.functions.Function0, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object pinToBottomWhileSettling$default(LazyListState lazyListState, long j, String str, String str2, G0U g0u, Function0 function0, boolean z, boolean z2, Function0 function02, Function0 function03, Function0 function04, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            g0u = C114542.INSTANCE;
        }
        if ((i & 16) != 0) {
            function0 = C114553.INSTANCE;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            z2 = false;
        }
        if ((i & 128) != 0) {
            function02 = C114564.INSTANCE;
        }
        if ((i & 256) != 0) {
            function03 = AnonymousClass5.INSTANCE;
        }
        return pinToBottomWhileSettling(lazyListState, j, str, str2, g0u, function0, z, z2, function02, function03, function04, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object scrollToAndHighlight(int r11, java.lang.String r12, androidx.compose.foundation.lazy.LazyListState r13, X.AT5<java.lang.Float, X.AOW> r14, X.G0U<? super java.lang.String, kotlin.Unit> r15, X.HtJ<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScrollingKt.scrollToAndHighlight(int, java.lang.String, androidx.compose.foundation.lazy.LazyListState, X.AT5, X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object scrollToBottom(androidx.compose.foundation.lazy.LazyListState r12, X.HtJ<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScrollingKt.scrollToBottom(androidx.compose.foundation.lazy.LazyListState, X.HtJ):java.lang.Object");
    }

    public static final void ViewportMessageIdTracker(LazyListState lazyListState, HatchConversationUiState hatchConversationUiState, AHD<? extends HatchConversationListItem> ahd, BFM bfm, int i) {
        AnonymousClass005.A0x(lazyListState, hatchConversationUiState, ahd);
        bfm.AgG(847096287);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, lazyListState) | i : i;
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, ahd);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 131, 130), bfm, iA0d)) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            MutableState mutableStateA00 = C1er.A00(bfm, ahd);
            boolean zA1V = AnonymousClass002.A1V(bfm, abstractC3358CGzA0h, bfm.A65(mutableStateA00), AnonymousClass001.A1M(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new HatchConversationScrollingKt$ViewportMessageIdTracker$1$1(lazyListState, mutableStateA00, abstractC3358CGzA0h, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, lazyListState);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114512(lazyListState, hatchConversationUiState, ahd, i);
        }
    }

    public static final /* synthetic */ Long access$ConversationHistoryLoader$lambda$3(MutableState mutableState) {
        return (Long) mutableState.getValue();
    }

    public static final int bottomOverflowPx(C2A9 c2a9, C16C c16c) {
        AnonymousClass003.A0u(c2a9, c16c);
        C1160Acs c1160Acs = (C1160Acs) c16c;
        C1161Act c1161Act = (C1161Act) c2a9;
        return ((c1160Acs.A02 + c1160Acs.A09) + c1161Act.A02) - c1161Act.A06;
    }

    public static final int indexOfDeeplinkedMessage(List<? extends HatchConversationListItem> list, String str) {
        HatchConversationListItem.Message message;
        HatchMessageUiModel hatchMessageUiModel;
        boolean zA1b = AnonymousClass004.A1b(list, str);
        int i = 0;
        for (HatchConversationListItem hatchConversationListItem : list) {
            if ((hatchConversationListItem instanceof HatchConversationListItem.Message) && (message = (HatchConversationListItem.Message) hatchConversationListItem) != null && (hatchMessageUiModel = message.message) != null) {
                String str2 = hatchMessageUiModel.id;
                if (!str.equals(str2) && !C7BY.A0q(str2, str, zA1b)) {
                    AHD<HatchWidgetPresentation> ahd = hatchMessageUiModel.presentations;
                    if (ahd != null && (!(ahd instanceof Collection) || !ahd.isEmpty())) {
                        Iterator it = ahd.iterator();
                        while (it.hasNext()) {
                            if (str.equals(((HatchWidgetPresentation) it.next()).presentationEventId)) {
                            }
                        }
                    }
                }
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final Set<String> responseContentIds(List<? extends HatchConversationListItem> list, ADq aDq) {
        HatchConversationListItem.Message message;
        AnonymousClass003.A0u(list, aDq);
        AIY aiy = new AIY();
        Iterator<Integer> it = aDq.iterator();
        while (it.hasNext()) {
            Object objA0A = AbstractC0878AGe.A0A(((BNt) it).A00(), list);
            if ((objA0A instanceof HatchConversationListItem.Message) && (message = (HatchConversationListItem.Message) objA0A) != null) {
                aiy.add(FGI.A0M("message:", message.key));
                Iterable iterable = message.message.widgets;
                if (iterable == null) {
                    iterable = C0881AGi.A00;
                }
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    aiy.add(FGI.A0M("widget:", ((HatchWidget) it2.next()).widgetId));
                }
                Iterable iterable2 = message.message.presentations;
                if (iterable2 == null) {
                    iterable2 = C0881AGi.A00;
                }
                Iterator it3 = iterable2.iterator();
                while (it3.hasNext()) {
                    aiy.add(FGI.A0M("presentation:", ((HatchWidgetPresentation) it3.next()).presentationId));
                }
            }
        }
        return AIX.A00(aiy);
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$pinToBottomWhileSettling$2, reason: invalid class name and case insensitive filesystem */
    public final class C114542 extends AbstractC7559F3s implements G0U<String, Integer> {
        public static final C114542 INSTANCE = new C114542();

        public C114542() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Integer invoke2(String str) {
            return -1;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Integer invoke(String str) {
            return -1;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$pinToBottomWhileSettling$3, reason: invalid class name and case insensitive filesystem */
    public final class C114553 extends AbstractC7559F3s implements Function0<Integer> {
        public static final C114553 INSTANCE = new C114553();

        public C114553() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return -1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return -1;
        }
    }
}
