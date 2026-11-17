package com.hatch.browser.protocol;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class CancelAck {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Fenced extends CancelAck {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final OperationId operationId;

        public Fenced(OperationId operationId) {
            C7384Etj.A0Y(operationId, 0);
            this.operationId = operationId;
        }

        public final Fenced copy(OperationId operationId) {
            C7384Etj.A0Y(operationId, 0);
            return new Fenced(operationId);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Fenced) && C7384Etj.areEqual(this.operationId, ((Fenced) obj).operationId));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ Fenced copy$default(Fenced fenced, OperationId operationId, int i, Object obj) {
            if ((i & 1) != 0) {
                operationId = fenced.operationId;
            }
            C7384Etj.A0Y(operationId, 0);
            return new Fenced(operationId);
        }

        public final OperationId component1() {
            return this.operationId;
        }

        public final OperationId getOperationId() {
            return this.operationId;
        }

        public int hashCode() {
            return this.operationId.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Fenced(operationId=", this.operationId);
        }
    }

    public final class NoActiveOperation extends CancelAck {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final OperationId operationId;

        public NoActiveOperation(OperationId operationId) {
            C7384Etj.A0Y(operationId, 0);
            this.operationId = operationId;
        }

        public final NoActiveOperation copy(OperationId operationId) {
            C7384Etj.A0Y(operationId, 0);
            return new NoActiveOperation(operationId);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NoActiveOperation) && C7384Etj.areEqual(this.operationId, ((NoActiveOperation) obj).operationId));
        }

        public final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public static /* synthetic */ NoActiveOperation copy$default(NoActiveOperation noActiveOperation, OperationId operationId, int i, Object obj) {
            if ((i & 1) != 0) {
                operationId = noActiveOperation.operationId;
            }
            C7384Etj.A0Y(operationId, 0);
            return new NoActiveOperation(operationId);
        }

        public final OperationId component1() {
            return this.operationId;
        }

        public final OperationId getOperationId() {
            return this.operationId;
        }

        public int hashCode() {
            return this.operationId.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("NoActiveOperation(operationId=", this.operationId);
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public CancelAck() {
    }

    public /* synthetic */ CancelAck(C06H c06h) {
    }
}
