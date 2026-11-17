package com.facebook.aura.library.repo;

import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class UserProfileState extends C06G {
    public final LoadingState loadingState;
    public final UserProfile profile;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserProfileState) {
                UserProfileState userProfileState = (UserProfileState) obj;
                if (!C7384Etj.areEqual(this.profile, userProfileState.profile) || this.loadingState != userProfileState.loadingState) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ UserProfileState copy$default(UserProfileState userProfileState, UserProfile userProfile, LoadingState loadingState, int i, Object obj) {
        if ((i & 1) != 0) {
            userProfile = userProfileState.profile;
        }
        if ((i & 2) != 0) {
            loadingState = userProfileState.loadingState;
        }
        AnonymousClass003.A0u(userProfile, loadingState);
        return new UserProfileState(userProfile, loadingState);
    }

    public final UserProfile component1() {
        return this.profile;
    }

    public final LoadingState component2() {
        return this.loadingState;
    }

    public final LoadingState getLoadingState() {
        return this.loadingState;
    }

    public final UserProfile getProfile() {
        return this.profile;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.loadingState, AnonymousClass005.A0E(this.profile));
    }

    public UserProfileState(UserProfile userProfile, LoadingState loadingState) {
        AnonymousClass003.A0u(userProfile, loadingState);
        this.profile = userProfile;
        this.loadingState = loadingState;
    }

    public final UserProfileState copy(UserProfile userProfile, LoadingState loadingState) {
        AnonymousClass003.A0u(userProfile, loadingState);
        return new UserProfileState(userProfile, loadingState);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ UserProfileState(UserProfile userProfile, LoadingState loadingState, int i, C06H c06h) {
        this((i & 1) != 0 ? new UserProfile(null, null, null, null, null, AHI.A01) : userProfile, (i & 2) != 0 ? LoadingState.INITIAL : loadingState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
