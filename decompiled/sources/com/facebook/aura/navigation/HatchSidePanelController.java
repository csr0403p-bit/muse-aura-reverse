package com.facebook.aura.navigation;

import X.AGE;
import X.AGF;
import X.C00q;
import X.C00r;
import X.C06H;
import X.C7384Etj;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.facebook.aura.ui.adaptive.AuraSidePanelPresentation;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class HatchSidePanelController {
    public static final int $stable = 0;
    public final Set<Object> buttonSuppressions;
    public final C00r closeToken$delegate;
    public final MutableState contentKey$delegate;
    public final Set<Object> dockRequests;
    public final C00q dragOffsetPx$delegate;
    public final MutableState isButtonSuppressed$delegate;
    public final MutableState isClosing$delegate;
    public final MutableState isDockCollapsed$delegate;
    public final MutableState isDockRequested$delegate;
    public final MutableState isRailRequested$delegate;
    public final MutableState isSearchExpanded$delegate;
    public final C00r openDragCancelToken$delegate;
    public final MutableState openDragContentKey$delegate;
    public final C00r openDragToken$delegate;
    public final MutableState presentation$delegate;
    public final Set<Object> railRequests;
    public final C00q revealOffsetPx$delegate;

    public final void beginOpenDrag(HatchSidePanelContentKey hatchSidePanelContentKey) {
        C7384Etj.A0Y(hatchSidePanelContentKey, 0);
        if (!getPresentation().getDocksBesidePages() && getContentKey() == null && getOpenDragContentKey() == null) {
            setClosing(false);
            setOpenDragContentKey(hatchSidePanelContentKey);
            updateDragOffset(0.0f);
        }
    }

    public final void clearDragOffset() {
        setDragOffsetPx(0.0f);
    }

    public final void finishClose() {
        setContentKey(null);
        setClosing(false);
        setSearchExpanded(false);
        setDragOffsetPx(0.0f);
    }

    public final void finishOpenDragCancel() {
        setOpenDragContentKey(null);
        setDragOffsetPx(0.0f);
    }

    public final void hideImmediately() {
        setContentKey(null);
        setClosing(false);
        setSearchExpanded(false);
        setDragOffsetPx(0.0f);
        setRevealOffsetPx(0.0f);
    }

    public final void open(HatchSidePanelContentKey hatchSidePanelContentKey) {
        C7384Etj.A0Y(hatchSidePanelContentKey, 0);
        if (getPresentation().getDocksBesidePages()) {
            setDockCollapsed(false);
        } else {
            setClosing(false);
            setContentKey(hatchSidePanelContentKey);
        }
    }

    public final void releaseButtonSuppression(Object obj) {
        C7384Etj.A0Y(obj, 0);
        this.buttonSuppressions.remove(obj);
        setButtonSuppressed(!this.buttonSuppressions.isEmpty());
    }

    public final void releaseDockRequest(Object obj) {
        C7384Etj.A0Y(obj, 0);
        this.dockRequests.remove(obj);
        setDockRequested(!this.dockRequests.isEmpty());
    }

    public final void releaseRailRequest(Object obj) {
        C7384Etj.A0Y(obj, 0);
        this.railRequests.remove(obj);
        setRailRequested(!this.railRequests.isEmpty());
    }

    public final void settleOpenFromDrag() {
        setClosing(false);
        setOpenDragToken(this.openDragToken$delegate.AGd() + 1);
    }

    public final void toggle(HatchSidePanelContentKey hatchSidePanelContentKey) {
        C7384Etj.A0Y(hatchSidePanelContentKey, 0);
        if (getPresentation().getDocksBesidePages()) {
            setDockCollapsed(!MutableState.A0A(this.isDockCollapsed$delegate));
        } else if (getContentKey() == null || MutableState.A0A(this.isClosing$delegate)) {
            open(hatchSidePanelContentKey);
        } else {
            close();
        }
    }

    public final void updateDragOffset(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        setDragOffsetPx(f);
        updateRevealOffset(this.dragOffsetPx$delegate.AFn());
    }

    public final void updatePresentation(AuraSidePanelPresentation auraSidePanelPresentation) {
        C7384Etj.A0Y(auraSidePanelPresentation, 0);
        if (getPresentation() != auraSidePanelPresentation) {
            setPresentation(auraSidePanelPresentation);
            setOpenDragContentKey(null);
            hideImmediately();
        }
    }

    public final void updateRevealOffset(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        setRevealOffsetPx(f);
    }

    public /* synthetic */ HatchSidePanelController(AuraSidePanelPresentation auraSidePanelPresentation, int i, C06H c06h) {
        this((i & 1) != 0 ? AuraSidePanelPresentation.PushAside : auraSidePanelPresentation);
    }

    private final void setButtonSuppressed(boolean z) {
        MutableState.A09(z, this.isButtonSuppressed$delegate);
    }

    private final void setCloseToken(int i) {
        this.closeToken$delegate.AdX(i);
    }

    private final void setClosing(boolean z) {
        MutableState.A09(z, this.isClosing$delegate);
    }

    private final void setContentKey(HatchSidePanelContentKey hatchSidePanelContentKey) {
        this.contentKey$delegate.Af8(hatchSidePanelContentKey);
    }

    private final void setDockCollapsed(boolean z) {
        MutableState.A09(z, this.isDockCollapsed$delegate);
    }

    private final void setDockRequested(boolean z) {
        MutableState.A09(z, this.isDockRequested$delegate);
    }

    private final void setDragOffsetPx(float f) {
        this.dragOffsetPx$delegate.AdS(f);
    }

    private final void setOpenDragCancelToken(int i) {
        this.openDragCancelToken$delegate.AdX(i);
    }

    private final void setOpenDragContentKey(HatchSidePanelContentKey hatchSidePanelContentKey) {
        this.openDragContentKey$delegate.Af8(hatchSidePanelContentKey);
    }

    private final void setOpenDragToken(int i) {
        this.openDragToken$delegate.AdX(i);
    }

    private final void setPresentation(AuraSidePanelPresentation auraSidePanelPresentation) {
        this.presentation$delegate.Af8(auraSidePanelPresentation);
    }

    private final void setRailRequested(boolean z) {
        MutableState.A09(z, this.isRailRequested$delegate);
    }

    private final void setRevealOffsetPx(float f) {
        this.revealOffsetPx$delegate.AdS(f);
    }

    private final void setSearchExpanded(boolean z) {
        MutableState.A09(z, this.isSearchExpanded$delegate);
    }

    public final int getCloseToken() {
        return this.closeToken$delegate.AGd();
    }

    public final HatchSidePanelContentKey getContentKey() {
        return (HatchSidePanelContentKey) this.contentKey$delegate.getValue();
    }

    public final float getDragOffsetPx() {
        return this.dragOffsetPx$delegate.AFn();
    }

    public final int getOpenDragCancelToken() {
        return this.openDragCancelToken$delegate.AGd();
    }

    public final HatchSidePanelContentKey getOpenDragContentKey() {
        return (HatchSidePanelContentKey) this.openDragContentKey$delegate.getValue();
    }

    public final int getOpenDragToken() {
        return this.openDragToken$delegate.AGd();
    }

    public final AuraSidePanelPresentation getPresentation() {
        return (AuraSidePanelPresentation) this.presentation$delegate.getValue();
    }

    public final float getRevealOffsetPx() {
        return this.revealOffsetPx$delegate.AFn();
    }

    public final boolean isButtonSuppressed() {
        return MutableState.A0A(this.isButtonSuppressed$delegate);
    }

    public final boolean isClosing() {
        return MutableState.A0A(this.isClosing$delegate);
    }

    public final boolean isDockCollapsed() {
        return MutableState.A0A(this.isDockCollapsed$delegate);
    }

    public final boolean isDockRequested() {
        return MutableState.A0A(this.isDockRequested$delegate);
    }

    public final boolean isRailRequested() {
        return MutableState.A0A(this.isRailRequested$delegate);
    }

    public final boolean isSearchExpanded() {
        return MutableState.A0A(this.isSearchExpanded$delegate);
    }

    public final Object requestDock() {
        Object obj = new Object();
        this.dockRequests.add(obj);
        setDockRequested(true);
        return obj;
    }

    public final Object requestRail() {
        Object obj = new Object();
        this.railRequests.add(obj);
        setRailRequested(true);
        return obj;
    }

    public final Object suppressButton() {
        Object obj = new Object();
        this.buttonSuppressions.add(obj);
        setButtonSuppressed(true);
        return obj;
    }

    public final void cancelOpenDrag() {
        if (getOpenDragContentKey() != null) {
            setOpenDragCancelToken(this.openDragCancelToken$delegate.AGd() + 1);
        }
    }

    public final void close() {
        if (getContentKey() != null) {
            setClosing(true);
            setCloseToken(this.closeToken$delegate.AGd() + 1);
        }
    }

    public final void commitOpenDrag() {
        HatchSidePanelContentKey openDragContentKey = getOpenDragContentKey();
        if (openDragContentKey != null) {
            setOpenDragContentKey(null);
            setClosing(false);
            setContentKey(openDragContentKey);
        }
    }

    public final float getScreenRevealOffsetPx() {
        if (getPresentation().getMovesScreen()) {
            return this.revealOffsetPx$delegate.AFn();
        }
        return 0.0f;
    }

    public final void updateSearchExpanded(boolean z) {
        setSearchExpanded(z);
    }

    public HatchSidePanelController(AuraSidePanelPresentation auraSidePanelPresentation) {
        C7384Etj.A0Y(auraSidePanelPresentation, 0);
        this.buttonSuppressions = new LinkedHashSet();
        AGE ageA01 = AGF.A01();
        this.isButtonSuppressed$delegate = new ParcelableSnapshotMutableState(ageA01, false);
        this.presentation$delegate = new ParcelableSnapshotMutableState(ageA01, auraSidePanelPresentation);
        this.isDockCollapsed$delegate = new ParcelableSnapshotMutableState(ageA01, false);
        this.dockRequests = new LinkedHashSet();
        this.isDockRequested$delegate = new ParcelableSnapshotMutableState(ageA01, false);
        this.railRequests = new LinkedHashSet();
        this.isRailRequested$delegate = new ParcelableSnapshotMutableState(ageA01, false);
        this.contentKey$delegate = new ParcelableSnapshotMutableState(ageA01, null);
        this.dragOffsetPx$delegate = new ParcelableSnapshotMutableFloatState(0.0f);
        this.revealOffsetPx$delegate = new ParcelableSnapshotMutableFloatState(0.0f);
        this.isClosing$delegate = new ParcelableSnapshotMutableState(ageA01, false);
        this.isSearchExpanded$delegate = new ParcelableSnapshotMutableState(ageA01, false);
        this.openDragToken$delegate = new ParcelableSnapshotMutableIntState(0);
        this.closeToken$delegate = new ParcelableSnapshotMutableIntState(0);
        this.openDragContentKey$delegate = new ParcelableSnapshotMutableState(ageA01, null);
        this.openDragCancelToken$delegate = new ParcelableSnapshotMutableIntState(0);
    }

    public HatchSidePanelController() {
        this(AuraSidePanelPresentation.PushAside);
    }
}
