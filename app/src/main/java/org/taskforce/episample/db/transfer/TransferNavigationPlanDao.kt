package org.taskforce.episample.db.transfer

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import org.taskforce.episample.db.navigation.NavigationPlan

@Dao
interface TransferNavigationPlanDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNavigationPlans(navigationPlans: List<NavigationPlan>)

    @Query("SELECT * from navigation_plan_table")
    fun getNavigationPlans(): List<NavigationPlan>
}