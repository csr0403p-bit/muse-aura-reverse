package com.whatsapp.accountlinking.ipc.api.models.linked;

import X.AnonymousClass006;
import X.C06H;
import X.C2hx;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.C8PI;
import X.C9hr;
import com.whatsapp.accountlinking.ipc.api.models.LinkedOperation;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class NotifySeamlessLinkingCompleteOperation extends LinkedOperation {
    public static final Companion Companion = new Companion();
    public final Boolean contextualLinkSteal;
    public final int version;

    public final class Companion {
        public final C9hr<NotifySeamlessLinkingCompleteOperation> serializer() {
            return C8PI.A00;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(com.whatsapp.accountlinking.ipc.api.models.linked.NotifySeamlessLinkingCompleteOperation r4, X.C9j5 r5, X.C9iZ r6) {
        /*
            r3 = 0
            boolean r1 = r5.AfR()
            r2 = 1
            if (r1 != 0) goto Lc
            int r0 = r4.version
            if (r0 == r2) goto L1b
        Lc:
            int r0 = r4.version
            r5.AAK(r6, r3, r0)
            if (r1 == 0) goto L1b
        L13:
            X.9ix r1 = X.C07839ix.A00
            java.lang.Boolean r0 = r4.contextualLinkSteal
            r5.AAP(r0, r1, r6, r2)
        L1a:
            return
        L1b:
            java.lang.Boolean r0 = r4.contextualLinkSteal
            if (r0 == 0) goto L1a
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountlinking.ipc.api.models.linked.NotifySeamlessLinkingCompleteOperation.write$Self$java_com_whatsapp_accountlinking_ipc_api_api(com.whatsapp.accountlinking.ipc.api.models.linked.NotifySeamlessLinkingCompleteOperation, X.9j5, X.9iZ):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NotifySeamlessLinkingCompleteOperation) {
                NotifySeamlessLinkingCompleteOperation notifySeamlessLinkingCompleteOperation = (NotifySeamlessLinkingCompleteOperation) obj;
                if (this.version != notifySeamlessLinkingCompleteOperation.version || !C7384Etj.areEqual(this.contextualLinkSteal, notifySeamlessLinkingCompleteOperation.contextualLinkSteal)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NotifySeamlessLinkingCompleteOperation copy$default(NotifySeamlessLinkingCompleteOperation notifySeamlessLinkingCompleteOperation, int i, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = notifySeamlessLinkingCompleteOperation.version;
        }
        if ((i2 & 2) != 0) {
            bool = notifySeamlessLinkingCompleteOperation.contextualLinkSteal;
        }
        return new NotifySeamlessLinkingCompleteOperation(i, bool);
    }

    public static /* synthetic */ void getContextualLinkSteal$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public final int component1() {
        return this.version;
    }

    public final Boolean component2() {
        return this.contextualLinkSteal;
    }

    public final NotifySeamlessLinkingCompleteOperation copy(int i, Boolean bool) {
        return new NotifySeamlessLinkingCompleteOperation(i, bool);
    }

    public final Boolean getContextualLinkSteal() {
        return this.contextualLinkSteal;
    }

    @Override // com.whatsapp.accountlinking.ipc.api.models.Operation
    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.version * 31) + AnonymousClass006.A0D(this.contextualLinkSteal);
    }

    public String toString() {
        return C3cJ.A0L(this.contextualLinkSteal, ", contextualLinkSteal=", C60O.A0y("NotifySeamlessLinkingCompleteOperation(version=", this.version));
    }

    public NotifySeamlessLinkingCompleteOperation(int i, Boolean bool) {
        this.version = i;
        this.contextualLinkSteal = bool;
    }

    public /* synthetic */ NotifySeamlessLinkingCompleteOperation(int i, int i2, Boolean bool, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.contextualLinkSteal = null;
        } else {
            this.contextualLinkSteal = bool;
        }
    }

    public /* synthetic */ NotifySeamlessLinkingCompleteOperation(int i, Boolean bool, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : bool);
    }

    public NotifySeamlessLinkingCompleteOperation() {
        this(1, null);
    }
}
