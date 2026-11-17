package com.facebook.aura.widgets;

import X.BFI;
import com.facebook.aura.library.repo.LoadingState;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class GoalsListWidgetKt {
    public static final String GOALS_DEEPLINK_PATH = "goals";
    public static final long GOALS_STATE_TIMEOUT_MS = 5000;
    public static final String GOAL_ID_PARAM = "id";
    public static final int MAX_GOALS = 8;
    public static final Set<LoadingState> SETTLED_LOADING_STATES = BFI.A0H(new LoadingState[]{LoadingState.SUCCESS, LoadingState.ERROR, LoadingState.REFRESH_ERROR});
}
