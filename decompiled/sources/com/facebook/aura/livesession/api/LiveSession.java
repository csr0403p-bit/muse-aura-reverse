package com.facebook.aura.livesession.api;

import X.AnonymousClass001;
import X.C1BN;
import X.C20Q;
import X.C3UX;
import X.HtJ;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public interface LiveSession {
    LiveTranscript attachTranscript(LiveConversation liveConversation, C3UX c3ux);

    LiveSessionAttachmentLimit attachmentLimit(String str);

    Object endForAudioPlayback(HtJ<? super Boolean> htJ);

    C1BN<Boolean> isActive();

    boolean isActiveIn(String str);

    Function0<Unit> prepareStopGeneration(String str);

    Map<String, Object> routeOutgoing(Map<String, ? extends Object> map, String str);

    C20Q<Integer> statusOverride(String str);

    /* renamed from: com.facebook.aura.livesession.api.LiveSession$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static LiveSessionAttachmentLimit $default$attachmentLimit(LiveSession liveSession, String str) {
            return null;
        }

        public static boolean $default$isActiveIn(LiveSession liveSession, String str) {
            return false;
        }

        public static /* synthetic */ LiveSessionAttachmentLimit access$attachmentLimit$jd(LiveSession liveSession, String str) {
            return null;
        }

        public static /* synthetic */ boolean access$isActiveIn$jd(LiveSession liveSession, String str) {
            return false;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static LiveSessionAttachmentLimit attachmentLimit(LiveSession liveSession, String str) {
            return null;
        }

        @Deprecated
        public static Object endForAudioPlayback(LiveSession liveSession, HtJ<? super Boolean> htJ) {
            return AnonymousClass001.A0i();
        }

        @Deprecated
        public static boolean isActiveIn(LiveSession liveSession, String str) {
            return false;
        }
    }
}
