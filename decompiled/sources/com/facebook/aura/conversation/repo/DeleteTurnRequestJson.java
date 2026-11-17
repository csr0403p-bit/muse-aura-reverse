package com.facebook.aura.conversation.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class DeleteTurnRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String message_id;

    public final class Companion {
        public final C9hr<DeleteTurnRequestJson> serializer() {
            return DeleteTurnRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final DeleteTurnRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new DeleteTurnRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DeleteTurnRequestJson) && C7384Etj.areEqual(this.message_id, ((DeleteTurnRequestJson) obj).message_id));
    }

    public /* synthetic */ DeleteTurnRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(DeleteTurnRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.message_id = str;
    }

    public static /* synthetic */ DeleteTurnRequestJson copy$default(DeleteTurnRequestJson deleteTurnRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deleteTurnRequestJson.message_id;
        }
        C7384Etj.A0Y(str, 0);
        return new DeleteTurnRequestJson(str);
    }

    public final String component1() {
        return this.message_id;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public int hashCode() {
        return this.message_id.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public DeleteTurnRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.message_id = str;
    }
}
