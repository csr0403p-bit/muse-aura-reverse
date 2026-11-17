package com.facebook.aura.localbrowser;

import X.AEs;
import X.AGH;
import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C1BN;
import X.C20Q;
import X.C20Y;
import X.C3cG;
import X.C3cH;
import X.C3pS;
import X.C3rb;
import X.C7384Etj;
import X.F0C;
import X.G0W;
import X.GDB;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.identifiers.AuraDeviceId;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.model.BrowserTaskExecution;
import com.facebook.aura.model.BrowserTaskExecutionKind;
import com.facebook.aura.model.BrowserTaskIdKt;
import com.facebook.aura.model.BrowserTaskPresentation;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class LocalBrowserTaskPresentationViewModel extends AEs {
    public static final int $stable = 8;
    public final String deviceId;
    public final LocalBrowserTaskRegistry registry;
    public final F0C runtime$delegate;

    public final class Factory extends AuraViewModelFactory<LocalBrowserTaskPresentationViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new LocalBrowserTaskPresentationViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public LocalBrowserTaskPresentationViewModel create() {
            return new LocalBrowserTaskPresentationViewModel(this.userSession);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$1", f = "LocalBrowserTaskPresentationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0W<List<? extends LocalBrowserTaskRecordJson>, LocalBrowserFacts, HtJ<? super BrowserTaskPresentation>, Object> {
        public final /* synthetic */ Map<LocalBrowserTaskOutcome, String> $outcomeLabels;
        public final /* synthetic */ BrowserTaskPresentation $task;
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BrowserTaskPresentation browserTaskPresentation, Map<LocalBrowserTaskOutcome, String> map, HtJ<? super AnonymousClass1> htJ) {
            super(3, htJ);
            this.$task = browserTaskPresentation;
            this.$outcomeLabels = map;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<LocalBrowserTaskRecordJson> list, LocalBrowserFacts localBrowserFacts, HtJ<? super BrowserTaskPresentation> htJ) {
            AnonymousClass1 anonymousClass1 = LocalBrowserTaskPresentationViewModel.this.new AnonymousClass1(this.$task, this.$outcomeLabels, htJ);
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = localBrowserFacts;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            LocalBrowserFacts localBrowserFacts = (LocalBrowserFacts) this.L$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return LocalBrowserTaskPresentationViewModel.this.presentation(this.$task, this.$outcomeLabels, list, localBrowserFacts);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(List<? extends LocalBrowserTaskRecordJson> list, LocalBrowserFacts localBrowserFacts, HtJ<? super BrowserTaskPresentation> htJ) {
            return invoke2((List<LocalBrowserTaskRecordJson>) list, localBrowserFacts, htJ);
        }
    }

    public LocalBrowserTaskPresentationViewModel(final AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.registry = LocalBrowserTaskRegistry.Companion.getInstance(abstractC3358CGz);
        this.runtime$delegate = AbstractC5321DgF.A03(new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalBrowserRuntime.Companion.getInstance(abstractC3358CGz);
            }
        });
        this.deviceId = AuraDeviceId.INSTANCE.getNodeId();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalBrowserControl.values().length];
            try {
                AnonymousClass002.A13(LocalBrowserControl.AGENT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LocalBrowserControl.USER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(LocalBrowserControl.STOPPED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final LocalBrowserRuntime getRuntime() {
        return (LocalBrowserRuntime) this.runtime$delegate.getValue();
    }

    private final boolean isOnThisDevice(BrowserTaskPresentation browserTaskPresentation) {
        BrowserTaskExecution browserTaskExecution = browserTaskPresentation.execution;
        return browserTaskExecution.kind == BrowserTaskExecutionKind.LOCAL_DEVICE && C7384Etj.areEqual(browserTaskExecution.deviceId, this.deviceId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalBrowserSession activeSession(String str, Map<String, LocalBrowserSession> map) {
        Iterator<LocalBrowserSession> it = map.values().iterator();
        LocalBrowserSession localBrowserSession = null;
        boolean z = false;
        LocalBrowserSession localBrowserSession2 = null;
        while (true) {
            if (it.hasNext()) {
                LocalBrowserSession next = it.next();
                LocalBrowserSession localBrowserSession3 = next;
                LocalBrowserTask localBrowserTask = localBrowserSession3.task;
                if (C7384Etj.areEqual(localBrowserTask != null ? C3cH.A0b(localBrowserTask) : null, BrowserTaskIdKt.logicalBrowserTaskId(str)) && !localBrowserSession3.task.retired) {
                    if (z) {
                        break;
                    }
                    z = true;
                    localBrowserSession2 = next;
                }
            } else if (z) {
                localBrowserSession = localBrowserSession2;
            }
        }
        return localBrowserSession;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final BrowserTaskPresentation presentation(BrowserTaskPresentation browserTaskPresentation, Map<LocalBrowserTaskOutcome, String> map, List<LocalBrowserTaskRecordJson> list, LocalBrowserFacts localBrowserFacts) {
        Object objPrevious;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        ListIterator listIteratorA0n = C3cG.A0n(list);
        while (true) {
            if (!listIteratorA0n.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIteratorA0n.previous();
            if (BrowserTaskIdKt.logicalBrowserTaskId(((LocalBrowserTaskRecordJson) objPrevious).taskId).equals(browserTaskPresentation.browserTaskId)) {
                break;
            }
        }
        LocalBrowserTaskRecordJson localBrowserTaskRecordJson = (LocalBrowserTaskRecordJson) objPrevious;
        LocalBrowserTaskOutcome localBrowserTaskOutcome = localBrowserTaskRecordJson != null ? localBrowserTaskRecordJson.outcome : null;
        if (localBrowserTaskOutcome != null) {
            if (!localBrowserTaskOutcome.getLeavesRunToJarvis()) {
                String str5 = browserTaskPresentation.status;
                if (!"completed".equals(str5) && !"failed".equals(str5)) {
                    str3 = (String) AGH.A00(localBrowserTaskOutcome, map);
                    i = 188387;
                    str = null;
                    str2 = "stopped";
                    str4 = "";
                }
            }
            return BrowserTaskPresentation.copy$default(browserTaskPresentation, null, null, null, null, null, 0, null, false, 0, null, null, null, null, false, null, null, null, null, 253951, null);
        }
        if (!browserTaskPresentation.isTombstone() && localBrowserFacts != null && localBrowserFacts.userActionRequired != null) {
            int iOrdinal = localBrowserFacts.control.ordinal();
            if (iOrdinal == 0) {
                i = 196579;
                str = null;
                str2 = "awaiting_user_input";
                str3 = "";
                str4 = "agent";
            } else if (iOrdinal == 1) {
                i = 196579;
                str = null;
                str2 = BrowserTaskPresentation.STATUS_USER_CONTROLLED;
                str3 = "";
                str4 = "user";
            } else if (iOrdinal != 2) {
                throw C3cG.A0q();
            }
        }
        return browserTaskPresentation;
        return BrowserTaskPresentation.copy$default(browserTaskPresentation, str, str, str, str2, str3, 0, str, false, 0, str, str, str, str, false, str, str, str4, str, i, str);
    }

    public final BrowserTaskPresentation initialUiState(BrowserTaskPresentation browserTaskPresentation, Map<LocalBrowserTaskOutcome, String> map) {
        C1BN<LocalBrowserFacts> c1bn;
        AnonymousClass003.A0u(browserTaskPresentation, map);
        if (!isOnThisDevice(browserTaskPresentation)) {
            return browserTaskPresentation;
        }
        List<LocalBrowserTaskRecordJson> value = this.registry.records.getValue();
        LocalBrowserSession localBrowserSessionActiveSession = activeSession(browserTaskPresentation.browserTaskId, getRuntime().activeSessions.getValue());
        return presentation(browserTaskPresentation, map, value, (localBrowserSessionActiveSession == null || (c1bn = localBrowserSessionActiveSession.facts) == null) ? null : c1bn.getValue());
    }

    public final C20Q<BrowserTaskPresentation> uiState(BrowserTaskPresentation browserTaskPresentation, Map<LocalBrowserTaskOutcome, String> map) {
        AnonymousClass003.A0u(browserTaskPresentation, map);
        if (!isOnThisDevice(browserTaskPresentation)) {
            return new C20Y(browserTaskPresentation);
        }
        C3pS c3pSA00 = AbstractC05633ui.A00(new LocalBrowserTaskPresentationViewModel$uiState$$inlined$flatMapLatest$1(null), GDB.A01(new LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1(getRuntime().activeSessions, this, browserTaskPresentation)));
        return C3rb.A04(new AnonymousClass1(browserTaskPresentation, map, null), this.registry.records, c3pSA00);
    }
}
