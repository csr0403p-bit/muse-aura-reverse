package com.facebook.aura.conversation.repo;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class DeleteTurnResponseJson extends C06G {
    public final String context_rebuild;
    public final List<String> deleted_message_ids;
    public final Long transcript_revision;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cI.A1Z(C79.A01, DeleteTurnResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<DeleteTurnResponseJson> serializer() {
            return DeleteTurnResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeleteTurnResponseJson) {
                DeleteTurnResponseJson deleteTurnResponseJson = (DeleteTurnResponseJson) obj;
                if (!C7384Etj.areEqual(this.deleted_message_ids, deleteTurnResponseJson.deleted_message_ids) || !C7384Etj.areEqual(this.context_rebuild, deleteTurnResponseJson.context_rebuild) || !C7384Etj.areEqual(this.transcript_revision, deleteTurnResponseJson.transcript_revision)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeleteTurnResponseJson copy$default(DeleteTurnResponseJson deleteTurnResponseJson, List list, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deleteTurnResponseJson.deleted_message_ids;
        }
        if ((i & 2) != 0) {
            str = deleteTurnResponseJson.context_rebuild;
        }
        if ((i & 4) != 0) {
            l = deleteTurnResponseJson.transcript_revision;
        }
        return deleteTurnResponseJson.copy(list, str, l);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(DeleteTurnResponseJson deleteTurnResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(deleteTurnResponseJson.deleted_message_ids)) {
            c9j5.AAQ(deleteTurnResponseJson.deleted_message_ids, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !C3cH.A1Q(deleteTurnResponseJson.context_rebuild)) {
            c9j5.AAV(deleteTurnResponseJson.context_rebuild, c9iZ, 1);
        }
        if (zAfR || deleteTurnResponseJson.transcript_revision != null) {
            c9j5.AAP(deleteTurnResponseJson.transcript_revision, C9j1.A00, c9iZ, 2);
        }
    }

    public final List<String> component1() {
        return this.deleted_message_ids;
    }

    public final String component2() {
        return this.context_rebuild;
    }

    public final Long component3() {
        return this.transcript_revision;
    }

    public final String getContext_rebuild() {
        return this.context_rebuild;
    }

    public final List<String> getDeleted_message_ids() {
        return this.deleted_message_ids;
    }

    public final Long getTranscript_revision() {
        return this.transcript_revision;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.context_rebuild, AnonymousClass005.A0E(this.deleted_message_ids)) + AnonymousClass006.A0D(this.transcript_revision);
    }

    public DeleteTurnResponseJson(List<String> list, String str, Long l) {
        AnonymousClass003.A0u(list, str);
        this.deleted_message_ids = list;
        this.context_rebuild = str;
        this.transcript_revision = l;
    }

    public final DeleteTurnResponseJson copy(List<String> list, String str, Long l) {
        AnonymousClass003.A0u(list, str);
        return new DeleteTurnResponseJson(list, str, l);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeleteTurnResponseJson(int i, List list, String str, Long l, C2hx c2hx) {
        this.deleted_message_ids = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.context_rebuild = "";
        } else {
            this.context_rebuild = str;
        }
        if ((i & 4) == 0) {
            this.transcript_revision = null;
        } else {
            this.transcript_revision = l;
        }
    }

    public /* synthetic */ DeleteTurnResponseJson(List list, String str, Long l, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : l);
    }

    public DeleteTurnResponseJson() {
        this(C0881AGi.A00, "", null);
    }
}
