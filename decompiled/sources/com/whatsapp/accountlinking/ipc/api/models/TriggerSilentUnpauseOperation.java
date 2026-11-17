package com.whatsapp.accountlinking.ipc.api.models;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C2277BSd;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C79;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9ke;
import X.C9ki;
import X.F0C;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class TriggerSilentUnpauseOperation extends UnlinkedOperation {
    public static final long TRIGGER_SILENT_UNPAUSE_TIMEOUT_MS = 30000;
    public final String sourceApp;
    public final C9ki trigger;
    public final int version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, C2277BSd.A00(C79.A01, 4)};

    public final class Companion {
        public final C9hr<TriggerSilentUnpauseOperation> serializer() {
            return C9ke.A00;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TriggerSilentUnpauseOperation) {
                TriggerSilentUnpauseOperation triggerSilentUnpauseOperation = (TriggerSilentUnpauseOperation) obj;
                if (!C7384Etj.areEqual(this.sourceApp, triggerSilentUnpauseOperation.sourceApp) || this.version != triggerSilentUnpauseOperation.version || this.trigger != triggerSilentUnpauseOperation.trigger) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TriggerSilentUnpauseOperation copy$default(TriggerSilentUnpauseOperation triggerSilentUnpauseOperation, String str, int i, C9ki c9ki, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = triggerSilentUnpauseOperation.sourceApp;
        }
        if ((i2 & 2) != 0) {
            i = triggerSilentUnpauseOperation.version;
        }
        if ((i2 & 4) != 0) {
            c9ki = triggerSilentUnpauseOperation.trigger;
        }
        return triggerSilentUnpauseOperation.copy(str, i, c9ki);
    }

    public static /* synthetic */ void getSourceApp$annotations() {
    }

    public static /* synthetic */ void getTrigger$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(TriggerSilentUnpauseOperation triggerSilentUnpauseOperation, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(triggerSilentUnpauseOperation.sourceApp, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || triggerSilentUnpauseOperation.version != 1) {
            c9j5.AAK(c9iZ, 1, triggerSilentUnpauseOperation.version);
        }
        if (zAfR || triggerSilentUnpauseOperation.trigger != C9ki.A03) {
            c9j5.AAQ(triggerSilentUnpauseOperation.trigger, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.sourceApp;
    }

    public final int component2() {
        return this.version;
    }

    public final C9ki component3() {
        return this.trigger;
    }

    @Override // com.whatsapp.accountlinking.ipc.api.models.Operation
    public long getOperationTimeoutMs() {
        return 30000L;
    }

    public final String getSourceApp() {
        return this.sourceApp;
    }

    public final C9ki getTrigger() {
        return this.trigger;
    }

    @Override // com.whatsapp.accountlinking.ipc.api.models.Operation
    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.trigger, (AnonymousClass001.A0G(this.sourceApp) + this.version) * 31);
    }

    public String toString() {
        String str = this.sourceApp;
        int i = this.version;
        C9ki c9ki = this.trigger;
        StringBuilder sbA0x = C3cI.A0x("TriggerSilentUnpauseOperation(sourceApp=", str);
        C8j4.A1Q(sbA0x, i);
        return C3cJ.A0L(c9ki, ", trigger=", sbA0x);
    }

    public TriggerSilentUnpauseOperation(String str, int i, C9ki c9ki) {
        AnonymousClass003.A0v(str, c9ki);
        this.sourceApp = str;
        this.version = i;
        this.trigger = c9ki;
    }

    public final TriggerSilentUnpauseOperation copy(String str, int i, C9ki c9ki) {
        AnonymousClass003.A0v(str, c9ki);
        return new TriggerSilentUnpauseOperation(str, i, c9ki);
    }

    public /* synthetic */ TriggerSilentUnpauseOperation(int i, String str, int i2, C9ki c9ki, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(C9ke.A01, i, 1);
            throw F60.createAndThrow();
        }
        this.sourceApp = str;
        if ((i & 2) == 0) {
            this.version = 1;
        } else {
            this.version = i2;
        }
        if ((i & 4) == 0) {
            this.trigger = C9ki.A03;
        } else {
            this.trigger = c9ki;
        }
    }

    public /* synthetic */ TriggerSilentUnpauseOperation(String str, int i, C9ki c9ki, int i2, C06H c06h) {
        this(str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? C9ki.A03 : c9ki);
    }
}
