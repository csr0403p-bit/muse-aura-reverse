package androidx.compose.runtime.snapshots;

/* loaded from: classes4.dex */
public final class SnapshotApplyConflictException extends Exception {
    public final Snapshot snapshot;

    public SnapshotApplyConflictException(Snapshot snapshot) {
        this.snapshot = snapshot;
    }
}
