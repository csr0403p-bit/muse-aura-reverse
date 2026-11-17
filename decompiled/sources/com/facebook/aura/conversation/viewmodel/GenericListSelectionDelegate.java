package com.facebook.aura.conversation.viewmodel;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.BO6;
import X.C0953AJg;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C9286GCn;
import X.G0U;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.InterfaceC0962AJp;
import com.facebook.aura.conversation.repo.HatchConversationRepository;
import com.facebook.aura.model.GenericListPresentationKt;
import com.facebook.aura.model.HatchMessageSendStatus;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.model.JSONState;
import com.facebook.aura.model.WidgetStateSource;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class GenericListSelectionDelegate {
    public static final int $stable = 8;
    public final HatchConversationRepository repository;
    public final C3UX scope;
    public final BLG<InterfaceC0962AJp<String, GenericListSelection>> selections;
    public final G0U<HatchSendMessage, Unit> sendMessage;
    public final C1BN<BO6<String, GenericListSelection>> uiState;

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.GenericListSelectionDelegate$select$1", f = "GenericListSelectionDelegate.kt", l = {54, 56}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.GenericListSelectionDelegate$select$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchSendMessage $message;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ int $rowIndex;
        public final /* synthetic */ WidgetStateSource $source;
        public final /* synthetic */ String $text;
        public int I$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.GenericListSelectionDelegate$select$1$2", f = "GenericListSelectionDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.GenericListSelectionDelegate$select$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<HatchMessageSendStatus, HtJ<? super Boolean>, Object> {
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

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(AnonymousClass006.A1Z(obj2, HatchMessageSendStatus.SENDING));
            }

            @Override // X.G0V
            public final Object invoke(HatchMessageSendStatus hatchMessageSendStatus, HtJ<? super Boolean> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
                anonymousClass2.L$0 = hatchMessageSendStatus;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* renamed from: com.facebook.aura.conversation.viewmodel.GenericListSelectionDelegate$select$1$4, reason: invalid class name */
        public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<JSONState, Boolean> {
            public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

            public AnonymousClass4() {
                super(1);
            }

            @Override // X.G0U
            public final Boolean invoke(JSONState jSONState) {
                C7384Etj.A0Y(jSONState, 0);
                return Boolean.valueOf(!GenericListPresentationKt.genericListSelectionLocked(jSONState));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchSendMessage hatchSendMessage, WidgetStateSource widgetStateSource, String str, int i, String str2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$message = hatchSendMessage;
            this.$source = widgetStateSource;
            this.$presentationId = str;
            this.$rowIndex = i;
            this.$text = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return GenericListSelectionDelegate.this.new AnonymousClass1(this.$message, this.$source, this.$presentationId, this.$rowIndex, this.$text, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
        /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 219
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.GenericListSelectionDelegate.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void select(String str, String str2, int i, String str3) {
        WidgetStateSource widgetStateSourceCaptureWidgetState;
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1B(str2, 1, str3);
        if (this.selections.getValue().containsKey(str2) || (widgetStateSourceCaptureWidgetState = this.repository.captureWidgetState(str, str2)) == null || GenericListPresentationKt.genericListSelectionLocked(widgetStateSourceCaptureWidgetState.state)) {
            return;
        }
        HatchSendMessage hatchSendMessage = new HatchSendMessage(str3, null, null, null, null, null, null, null, null, false, null, null, null, 8190, null);
        BLG<InterfaceC0962AJp<String, GenericListSelection>> blg = this.selections;
        blg.Af8(blg.getValue().AYj(str2, new GenericListSelection(i, hatchSendMessage.requestId, true)));
        AnonymousClass001.A1J(new AnonymousClass1(hatchSendMessage, widgetStateSourceCaptureWidgetState, str2, i, str3, null), this.scope);
    }

    public final C1BN<BO6<String, GenericListSelection>> getUiState() {
        return this.uiState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GenericListSelectionDelegate(C3UX c3ux, HatchConversationRepository hatchConversationRepository, G0U<? super HatchSendMessage, Unit> g0u) {
        AnonymousClass005.A0x(c3ux, hatchConversationRepository, g0u);
        this.scope = c3ux;
        this.repository = hatchConversationRepository;
        this.sendMessage = g0u;
        C9286GCn c9286GCnA01 = HnJ.A01(C0953AJg.A00());
        this.selections = c9286GCnA01;
        this.uiState = C3Pi.A00(c9286GCnA01);
    }
}
