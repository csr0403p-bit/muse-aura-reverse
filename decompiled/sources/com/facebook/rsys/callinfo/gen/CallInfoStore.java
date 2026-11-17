package com.facebook.rsys.callinfo.gen;

import X.F60;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class CallInfoStore {
    public abstract void readCallInfo(String str, boolean z, CallInfoReadCallback callInfoReadCallback);

    public abstract void readUserProfiles(ArrayList<String> arrayList, String str, UserProfilesReadCallback userProfilesReadCallback);

    public abstract void registerObserver(CallInfoObserver callInfoObserver);

    public abstract void unregisterObserver(CallInfoObserver callInfoObserver);

    public CallInfoStore() {
        throw F60.createAndThrow();
    }
}
