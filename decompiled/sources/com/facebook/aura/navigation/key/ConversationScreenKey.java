package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ConversationScreenKey extends C06G implements AuraNavKey {
    public static final Companion Companion = new Companion();
    public final String highlightMessageId;
    public final Long highlightMessageSeq;
    public final boolean isCreatingNewThread;
    public final boolean isOpenedFromArchive;
    public final String sessionId;
    public final String title;

    public final class Companion {
        public final C9hr<ConversationScreenKey> serializer() {
            return ConversationScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConversationScreenKey(String str, String str2, boolean z, String str3, Long l, boolean z2) {
        C7384Etj.A0Y(str, 0);
        this.sessionId = str;
        this.title = str2;
        this.isCreatingNewThread = z;
        this.highlightMessageId = str3;
        this.highlightMessageSeq = l;
        this.isOpenedFromArchive = z2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(ConversationScreenKey conversationScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(conversationScreenKey.sessionId, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || conversationScreenKey.title != null) {
            c9j5.AAP(conversationScreenKey.title, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || conversationScreenKey.isCreatingNewThread) {
            c9j5.AA7(c9iZ, 2, conversationScreenKey.isCreatingNewThread);
        }
        if (zAfR || conversationScreenKey.highlightMessageId != null) {
            c9j5.AAP(conversationScreenKey.highlightMessageId, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || conversationScreenKey.highlightMessageSeq != null) {
            c9j5.AAP(conversationScreenKey.highlightMessageSeq, C9j1.A00, c9iZ, 4);
        }
        if (zAfR || conversationScreenKey.isOpenedFromArchive) {
            c9j5.AA7(c9iZ, 5, conversationScreenKey.isOpenedFromArchive);
        }
    }

    public final ConversationScreenKey copy(String str, String str2, boolean z, String str3, Long l, boolean z2) {
        C7384Etj.A0Y(str, 0);
        return new ConversationScreenKey(str, str2, z, str3, l, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConversationScreenKey) {
                ConversationScreenKey conversationScreenKey = (ConversationScreenKey) obj;
                if (!C7384Etj.areEqual(this.sessionId, conversationScreenKey.sessionId) || !C7384Etj.areEqual(this.title, conversationScreenKey.title) || this.isCreatingNewThread != conversationScreenKey.isCreatingNewThread || !C7384Etj.areEqual(this.highlightMessageId, conversationScreenKey.highlightMessageId) || !C7384Etj.areEqual(this.highlightMessageSeq, conversationScreenKey.highlightMessageSeq) || this.isOpenedFromArchive != conversationScreenKey.isOpenedFromArchive) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConversationScreenKey copy$default(ConversationScreenKey conversationScreenKey, String str, String str2, boolean z, String str3, Long l, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationScreenKey.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = conversationScreenKey.title;
        }
        if ((i & 4) != 0) {
            z = conversationScreenKey.isCreatingNewThread;
        }
        if ((i & 8) != 0) {
            str3 = conversationScreenKey.highlightMessageId;
        }
        if ((i & 16) != 0) {
            l = conversationScreenKey.highlightMessageSeq;
        }
        if ((i & 32) != 0) {
            z2 = conversationScreenKey.isOpenedFromArchive;
        }
        return conversationScreenKey.copy(str, str2, z, str3, l, z2);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.title;
    }

    public final boolean component3() {
        return this.isCreatingNewThread;
    }

    public final String component4() {
        return this.highlightMessageId;
    }

    public final Long component5() {
        return this.highlightMessageSeq;
    }

    public final boolean component6() {
        return this.isOpenedFromArchive;
    }

    public final String getHighlightMessageId() {
        return this.highlightMessageId;
    }

    public final Long getHighlightMessageSeq() {
        return this.highlightMessageSeq;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A00((((C0KA.A01((AnonymousClass001.A0G(this.sessionId) + AnonymousClass006.A0G(this.title)) * 31, this.isCreatingNewThread) + AnonymousClass006.A0G(this.highlightMessageId)) * 31) + C06G.A04(this.highlightMessageSeq)) * 31, this.isOpenedFromArchive);
    }

    public final boolean isCreatingNewThread() {
        return this.isCreatingNewThread;
    }

    public final boolean isOpenedFromArchive() {
        return this.isOpenedFromArchive;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConversationScreenKey(String str, String str2, boolean z, String str3, Long l, boolean z2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : l, AnonymousClass002.A1R(i, z2));
    }

    public /* synthetic */ ConversationScreenKey(int i, String str, String str2, boolean z, String str3, Long l, boolean z2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ConversationScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.sessionId = str;
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.isCreatingNewThread = false;
        } else {
            this.isCreatingNewThread = z;
        }
        if ((i & 8) == 0) {
            this.highlightMessageId = null;
        } else {
            this.highlightMessageId = str3;
        }
        if ((i & 16) == 0) {
            this.highlightMessageSeq = null;
        } else {
            this.highlightMessageSeq = l;
        }
        if ((i & 32) == 0) {
            this.isOpenedFromArchive = false;
        } else {
            this.isOpenedFromArchive = z2;
        }
    }
}
