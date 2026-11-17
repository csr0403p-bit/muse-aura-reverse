package com.facebook.aura.localbrowser.core;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.hatch.browser.core.BrowserHostDownloads;
import com.hatch.browser.core.BrowserHostNativeControls;
import com.hatch.browser.core.BrowserHostPdf;
import com.hatch.browser.core.Page;
import com.hatch.browser.core.PageAccess;
import com.hatch.browser.core.TaskPageGroup;
import com.hatch.browser.core.TaskPageGroupRetirement;
import com.hatch.browser.protocol.ApiException;
import com.hatch.browser.protocol.BrowserTaskBinding;
import com.hatch.browser.protocol.NativePageIdentity;
import com.hatch.browser.protocol.NotificationStatus;
import com.hatch.browser.protocol.TaskPageGroupControlChange;
import com.hatch.browser.protocol.TaskPageGroupControlRevision;
import com.hatch.browser.protocol.TaskPageGroupControlState;
import com.hatch.browser.protocol.TaskPageGroupRetirementReceipt;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class BrowserEngineGroup {
    public static final int $stable = 8;
    public final BrowserEngineAuthority authority;
    public final AtomicReference<BrowserEngineGroupControl> control;
    public final TaskPageGroup group;
    public final BrowserTaskBinding task;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngineGroup$retire$1", f = "BrowserEngineGroup.kt", l = {103}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.core.BrowserEngineGroup$retire$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public final /* synthetic */ TaskPageGroupRetirement $retirement;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ BrowserEngineGroup this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TaskPageGroupRetirement taskPageGroupRetirement, BrowserEngineGroup browserEngineGroup, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.$retirement = taskPageGroupRetirement;
            this.this$0 = browserEngineGroup;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.$retirement, this.this$0, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.AutoCloseable] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            TaskPageGroupRetirement taskPageGroupRetirement;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    TaskPageGroupRetirement taskPageGroupRetirement2 = this.$retirement;
                    this.L$0 = taskPageGroupRetirement2;
                    this.L$1 = null;
                    this.label = 1;
                    obj = taskPageGroupRetirement2.awaitSettlement(this);
                    taskPageGroupRetirement = taskPageGroupRetirement2;
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    ?? r2 = (AutoCloseable) this.L$0;
                    Hwg.A00(obj);
                    taskPageGroupRetirement = r2;
                }
                TaskPageGroupRetirementReceipt taskPageGroupRetirementReceipt = (TaskPageGroupRetirementReceipt) obj;
                if (taskPageGroupRetirement != null) {
                    taskPageGroupRetirement.close();
                }
                Boolean boolValueOf = Boolean.valueOf(taskPageGroupRetirementReceipt.retired && taskPageGroupRetirementReceipt.settled);
                BrowserEngineGroup browserEngineGroup = this.this$0;
                if (boolValueOf.booleanValue()) {
                    browserEngineGroup.group.destroy();
                }
                return boolValueOf;
            } finally {
            }
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final BrowserEnginePage addPage(BrowserPageTarget browserPageTarget, long j, boolean z, BrowserPageCloser browserPageCloser, BrowserHostPdf browserHostPdf, BrowserPageFileSource browserPageFileSource, BrowserHostDownloads browserHostDownloads, BrowserHostNativeControls browserHostNativeControls, Function0<Boolean> function0) {
        AnonymousClass003.A0w(browserPageTarget, browserPageCloser);
        C7384Etj.A0Y(function0, 8);
        BrowserEnginePageFacts browserEnginePageFacts = new BrowserEnginePageFacts(this.task, new NativePageIdentity.CdpTarget(browserPageTarget.browserInstanceId, browserPageTarget.targetId), browserPageCloser, browserHostPdf, browserPageFileSource, browserHostDownloads, browserHostNativeControls, function0, this.control, j, z);
        if (!this.authority.register(browserEnginePageFacts)) {
            return null;
        }
        try {
            PageAccess pageAccessPageEndpoint = PageAccess.Companion.pageEndpoint(browserPageTarget.endpoint, browserPageTarget.browserInstanceId, browserPageTarget.targetId);
            try {
                Page pageAddPage = this.group.addPage(pageAccessPageEndpoint, BrowserEngineGroupKt.pageStateChange(j, z));
                if (pageAccessPageEndpoint != null) {
                    pageAccessPageEndpoint.close();
                }
                return new BrowserEnginePage(pageAddPage, browserEnginePageFacts, this.authority);
            } finally {
            }
        } catch (ApiException unused) {
            this.authority.unregister(browserEnginePageFacts);
            return null;
        }
    }

    public final byte[] decideSiteAccess(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return this.group.decideSiteAccess(bArr);
    }

    public final boolean updateControl(long j, BrowserEngineControl browserEngineControl) {
        C7384Etj.A0Y(browserEngineControl, 1);
        BrowserEngineGroupControl browserEngineGroupControl = new BrowserEngineGroupControl(j, BrowserEngineGroupKt.toTaskPageGroupControlState(browserEngineControl));
        this.control.set(browserEngineGroupControl);
        return this.group.updateControl(new TaskPageGroupControlChange(new TaskPageGroupControlRevision(j), browserEngineGroupControl.control)).status == NotificationStatus.APPLIED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BrowserEnginePage addPage$default(BrowserEngineGroup browserEngineGroup, BrowserPageTarget browserPageTarget, long j, boolean z, BrowserPageCloser browserPageCloser, BrowserHostPdf browserHostPdf, BrowserPageFileSource browserPageFileSource, BrowserHostDownloads browserHostDownloads, BrowserHostNativeControls browserHostNativeControls, Function0 function0, int i, Object obj) {
        if ((i & 32) != 0) {
            browserPageFileSource = null;
        }
        if ((i & 64) != 0) {
            browserHostDownloads = null;
        }
        if ((i & 128) != 0) {
            browserHostNativeControls = null;
        }
        if ((i & 256) != 0) {
            function0 = new Function0() { // from class: com.facebook.aura.localbrowser.core.BrowserEngineGroup$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AnonymousClass001.A0i();
                }
            };
        }
        return browserEngineGroup.addPage(browserPageTarget, j, z, browserPageCloser, browserHostPdf, browserPageFileSource, browserHostDownloads, browserHostNativeControls, function0);
    }

    public static final boolean addPage$lambda$0() {
        return true;
    }

    public final BrowserEngineSettlement retire() {
        return new BrowserEngineSettlement(new AnonymousClass1(this.group.retire(), this, null));
    }

    public BrowserEngineGroup(TaskPageGroup taskPageGroup, BrowserTaskBinding browserTaskBinding, BrowserEngineAuthority browserEngineAuthority) {
        AnonymousClass005.A0x(taskPageGroup, browserTaskBinding, browserEngineAuthority);
        this.group = taskPageGroup;
        this.task = browserTaskBinding;
        this.authority = browserEngineAuthority;
        this.control = BV4.A16(new BrowserEngineGroupControl(0L, TaskPageGroupControlState.STOPPED));
    }
}
