/***
 * @Autor: ittai vazquez
 * @since 2022-12-18
 * @version 1.0
 * this interface implements the JPA API for transactionality to the database
 */

package org.mycompany.myproduct.Models.Repository;

import org.mycompany.myproduct.Models.Entity.MyBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBoardRepository extends JpaRepository<MyBoard, Long> {

}
