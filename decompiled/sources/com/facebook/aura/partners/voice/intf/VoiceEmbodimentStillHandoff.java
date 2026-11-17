package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentStillHandoff extends C06G {
    public static final int $stable = 0;
    public final long callGeneration;
    public final VoiceEmbodimentMedia.StaticAvatar displayed;
    public final String displayedKey;
    public final VoiceEmbodimentMedia.StaticAvatar incoming;
    public final int incomingAttempt;
    public final int incomingFailures;
    public final String incomingKey;

    public VoiceEmbodimentStillHandoff() {
        this(0L, null, null, null, null, 0, 0);
    }

    public static /* synthetic */ VoiceEmbodimentStillHandoff copy$default(VoiceEmbodimentStillHandoff voiceEmbodimentStillHandoff, long j, VoiceEmbodimentMedia.StaticAvatar staticAvatar, String str, VoiceEmbodimentMedia.StaticAvatar staticAvatar2, String str2, int i, int i2, int i3, Object obj) {
        long j2 = j;
        VoiceEmbodimentMedia.StaticAvatar staticAvatar3 = staticAvatar;
        String str3 = str;
        VoiceEmbodimentMedia.StaticAvatar staticAvatar4 = staticAvatar2;
        String str4 = str2;
        int i4 = i;
        int i5 = i2;
        if ((i3 & 1) != 0) {
            j2 = voiceEmbodimentStillHandoff.callGeneration;
        }
        if ((i3 & 2) != 0) {
            staticAvatar3 = voiceEmbodimentStillHandoff.displayed;
        }
        if ((i3 & 4) != 0) {
            str3 = voiceEmbodimentStillHandoff.displayedKey;
        }
        if ((i3 & 8) != 0) {
            staticAvatar4 = voiceEmbodimentStillHandoff.incoming;
        }
        if ((i3 & 16) != 0) {
            str4 = voiceEmbodimentStillHandoff.incomingKey;
        }
        if ((i3 & 32) != 0) {
            i4 = voiceEmbodimentStillHandoff.incomingFailures;
        }
        if ((i3 & 64) != 0) {
            i5 = voiceEmbodimentStillHandoff.incomingAttempt;
        }
        return new VoiceEmbodimentStillHandoff(j2, staticAvatar3, str3, staticAvatar4, str4, i4, i5);
    }

    public final VoiceEmbodimentStillHandoff decoded(long j, String str) {
        C7384Etj.A0Y(str, 1);
        return isIncoming(j, str) ? new VoiceEmbodimentStillHandoff(j, this.incoming, this.incomingKey, null, null, 0, 0) : this;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceEmbodimentStillHandoff) {
                VoiceEmbodimentStillHandoff voiceEmbodimentStillHandoff = (VoiceEmbodimentStillHandoff) obj;
                if (this.callGeneration != voiceEmbodimentStillHandoff.callGeneration || !C7384Etj.areEqual(this.displayed, voiceEmbodimentStillHandoff.displayed) || !C7384Etj.areEqual(this.displayedKey, voiceEmbodimentStillHandoff.displayedKey) || !C7384Etj.areEqual(this.incoming, voiceEmbodimentStillHandoff.incoming) || !C7384Etj.areEqual(this.incomingKey, voiceEmbodimentStillHandoff.incomingKey) || this.incomingFailures != voiceEmbodimentStillHandoff.incomingFailures || this.incomingAttempt != voiceEmbodimentStillHandoff.incomingAttempt) {
                }
            }
            return false;
        }
        return true;
    }

    public final VoiceEmbodimentStillHandoff failed(long j, String str, int i) {
        int i2;
        C7384Etj.A0Y(str, 1);
        if (!isIncoming(j, str) || i != (i2 = this.incomingAttempt) || !getIncomingInFlight()) {
            return this;
        }
        int i3 = this.incomingFailures + 1;
        return i3 >= 10 ? new VoiceEmbodimentStillHandoff(this.callGeneration, this.displayed, this.displayedKey, null, null, 0, 0) : new VoiceEmbodimentStillHandoff(this.callGeneration, this.displayed, this.displayedKey, this.incoming, this.incomingKey, i3, i2);
    }

    public final VoiceEmbodimentStillHandoff retried(long j, String str) {
        C7384Etj.A0Y(str, 1);
        if (!isIncoming(j, str) || getIncomingInFlight()) {
            return this;
        }
        return new VoiceEmbodimentStillHandoff(this.callGeneration, this.displayed, this.displayedKey, this.incoming, this.incomingKey, this.incomingFailures, this.incomingAttempt + 1);
    }

    public final VoiceEmbodimentStillHandoff target(long j, VoiceEmbodimentMedia.StaticAvatar staticAvatar, String str, Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 3);
        VoiceEmbodimentStillHandoff voiceEmbodimentStillHandoffForCall = forCall(j);
        VoiceEmbodimentMedia.StaticAvatar staticAvatar2 = voiceEmbodimentStillHandoffForCall.displayed;
        if (staticAvatar == null) {
            if (voiceEmbodimentStillHandoffForCall.incoming != null && AnonymousClass003.A1Y(function0)) {
                return voiceEmbodimentStillHandoffForCall;
            }
        } else if (str != null && staticAvatar2 != null && !staticAvatar2.equals(staticAvatar) && !str.equals(voiceEmbodimentStillHandoffForCall.displayedKey) && AnonymousClass003.A1Y(function0)) {
            String str2 = voiceEmbodimentStillHandoffForCall.incomingKey;
            return str.equals(str2) ? new VoiceEmbodimentStillHandoff(voiceEmbodimentStillHandoffForCall.callGeneration, voiceEmbodimentStillHandoffForCall.displayed, voiceEmbodimentStillHandoffForCall.displayedKey, staticAvatar, str2, voiceEmbodimentStillHandoffForCall.incomingFailures, voiceEmbodimentStillHandoffForCall.incomingAttempt) : new VoiceEmbodimentStillHandoff(voiceEmbodimentStillHandoffForCall.callGeneration, voiceEmbodimentStillHandoffForCall.displayed, voiceEmbodimentStillHandoffForCall.displayedKey, staticAvatar, str, 0, 0);
        }
        return new VoiceEmbodimentStillHandoff(j, staticAvatar, str, null, null, 0, 0);
    }

    private final VoiceEmbodimentStillHandoff forCall(long j) {
        return j == this.callGeneration ? this : new VoiceEmbodimentStillHandoff(j, null, null, null, null, 0, 0);
    }

    private final boolean isIncoming(long j, String str) {
        return j == this.callGeneration && this.incoming != null && C7384Etj.areEqual(str, this.incomingKey);
    }

    public final long component1() {
        return this.callGeneration;
    }

    public final VoiceEmbodimentMedia.StaticAvatar component2() {
        return this.displayed;
    }

    public final String component3() {
        return this.displayedKey;
    }

    public final VoiceEmbodimentMedia.StaticAvatar component4() {
        return this.incoming;
    }

    public final String component5() {
        return this.incomingKey;
    }

    public final int component6() {
        return this.incomingFailures;
    }

    public final int component7() {
        return this.incomingAttempt;
    }

    public final VoiceEmbodimentStillHandoff copy(long j, VoiceEmbodimentMedia.StaticAvatar staticAvatar, String str, VoiceEmbodimentMedia.StaticAvatar staticAvatar2, String str2, int i, int i2) {
        return new VoiceEmbodimentStillHandoff(j, staticAvatar, str, staticAvatar2, str2, i, i2);
    }

    public final long getCallGeneration() {
        return this.callGeneration;
    }

    public final VoiceEmbodimentMedia.StaticAvatar getDisplayed() {
        return this.displayed;
    }

    public final String getDisplayedKey() {
        return this.displayedKey;
    }

    public final VoiceEmbodimentMedia.StaticAvatar getIncoming() {
        return this.incoming;
    }

    public final int getIncomingAttempt() {
        return this.incomingAttempt;
    }

    public final int getIncomingFailures() {
        return this.incomingFailures;
    }

    public final boolean getIncomingInFlight() {
        return this.incoming != null && this.incomingFailures == this.incomingAttempt;
    }

    public final String getIncomingKey() {
        return this.incomingKey;
    }

    public int hashCode() {
        return ((((((((((C3cI.A01(this.callGeneration) + AnonymousClass006.A0D(this.displayed)) * 31) + AnonymousClass006.A0G(this.displayedKey)) * 31) + AnonymousClass006.A0D(this.incoming)) * 31) + AnonymousClass005.A0H(this.incomingKey)) * 31) + this.incomingFailures) * 31) + this.incomingAttempt;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceEmbodimentStillHandoff(long j, VoiceEmbodimentMedia.StaticAvatar staticAvatar, String str, VoiceEmbodimentMedia.StaticAvatar staticAvatar2, String str2, int i, int i2, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? null : staticAvatar, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : staticAvatar2, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2);
    }

    public VoiceEmbodimentStillHandoff(long j, VoiceEmbodimentMedia.StaticAvatar staticAvatar, String str, VoiceEmbodimentMedia.StaticAvatar staticAvatar2, String str2, int i, int i2) {
        this.callGeneration = j;
        this.displayed = staticAvatar;
        this.displayedKey = str;
        this.incoming = staticAvatar2;
        this.incomingKey = str2;
        this.incomingFailures = i;
        this.incomingAttempt = i2;
    }
}
