package com.facebook.rsys.state.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class State {
    public static G50<State> CONVERTER = C8922Fte.A00(20);
    public static long sMcfTypeId;
    public final int callState;
    public final boolean isActive;
    public final String localCallId;
    public final String selfUserId;

    public static native State createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof State) {
                State state = (State) obj;
                if (this.selfUserId.equals(state.selfUserId)) {
                    String str = this.localCallId;
                    String str2 = state.localCallId;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        if (this.callState != state.callState || this.isActive != state.isActive) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((BV8.A0B(this.selfUserId) + AnonymousClass006.A0G(this.localCallId)) * 31) + this.callState) * 31) + (this.isActive ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("State{selfUserId=");
        sbA0x.append(this.selfUserId);
        sbA0x.append(",localCallId=");
        sbA0x.append(this.localCallId);
        sbA0x.append(",callState=");
        sbA0x.append(this.callState);
        sbA0x.append(",isActive=");
        return AbstractC7610F5x.A0y(sbA0x, this.isActive);
    }

    public State(String str, String str2, int i, boolean z) {
        str.getClass();
        this.selfUserId = str;
        this.localCallId = str2;
        this.callState = i;
        this.isActive = z;
    }
}
