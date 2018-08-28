package org.taskforce.episample.core.mock

import org.taskforce.episample.core.interfaces.UserSettings

class MockUserSettings(override val gpsMinimumPrecision: Double,
                       override val gpsPreferredPrecision: Double,
                       override val allowPhotos: Boolean): UserSettings {
    
    companion object {
        fun createMockUserSettings(minPrecision: Double = 40.0,
                                   preferredPrecision: Double = 30.0,
                                   allowPhotos: Boolean = true): MockUserSettings {
            return MockUserSettings(minPrecision, preferredPrecision, allowPhotos)
        }
    }
}