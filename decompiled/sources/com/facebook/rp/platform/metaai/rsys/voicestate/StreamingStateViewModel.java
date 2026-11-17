package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public final class StreamingStateViewModel extends C06G {

    @SerializedName("streaming_state")
    public final String streamingState;

    @SerializedName("tool_name")
    public final Integer toolName;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StreamingStateViewModel) {
                StreamingStateViewModel streamingStateViewModel = (StreamingStateViewModel) obj;
                if (!C7384Etj.areEqual(this.streamingState, streamingStateViewModel.streamingState) || !C7384Etj.areEqual(this.toolName, streamingStateViewModel.toolName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ StreamingStateViewModel copy$default(StreamingStateViewModel streamingStateViewModel, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamingStateViewModel.streamingState;
        }
        if ((i & 2) != 0) {
            num = streamingStateViewModel.toolName;
        }
        return new StreamingStateViewModel(str, num);
    }

    public final String component1() {
        return this.streamingState;
    }

    public final Integer component2() {
        return this.toolName;
    }

    public final StreamingStateViewModel copy(String str, Integer num) {
        return new StreamingStateViewModel(str, num);
    }

    public final String getStreamingState() {
        return this.streamingState;
    }

    public final Integer getToolName() {
        return this.toolName;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.streamingState) * 31) + C3cH.A02(this.toolName);
    }

    public String toString() {
        return C3cJ.A0L(this.toolName, ", toolName=", C3cI.A0x("StreamingStateViewModel(streamingState=", this.streamingState));
    }

    public StreamingStateViewModel(String str, Integer num) {
        this.streamingState = str;
        this.toolName = num;
    }
}
