package studentcollection;


import java.io.Serializable;
import studentspec.StudentSpec;

import java.util.Iterator;

/**
 * <p>
 * Title: StudentCollectionSpec</p>
 * <p>
 * <p>
 * Description: specification of the functionalities available for manipulating a
 * collection of Student objects. Note that this specification is silent on the issue
 * of duplicate collection entries, that is, this specification neither requires nor
 * forbids that collection entries be unique (distinguishable from all other collection
 * entries in some manner).</p>
 * <p>
 * <p>
 * Copyright: Copyright (c) 2006, 2016</p>
 *
 * @author J S Kasprzyk
 * @version 1.9
 */
public interface StudentCollectionSpec extends Serializable
{
    public final long serialVersionUID = 1L;

    public final static int DEFAULT_STUDENT_COLLECTION_CAPACITY = 5000;

    /**
     * create a StudentCollectionSpec-type object with capacity DEFAULT_STUDENT_COLLECTION_CAPACITY.
     *
     * @return a StudentCollectionSpec-type object with capacity DEFAULT_STUDENT_COLLECTION_CAPACITY.
     */
    public static StudentCollectionSpec createStudentCollection()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * create a StudentCollectionSpec-type object with the specified capacity.
     *
     * @param initialCapacity initial capacity of collection (must be non-negative)
     *
     * @return a StudentCollectionSpec-type object with the specified capacity.
     *
     * @throws StudentCollectionException if the supplied initial capacity is negative
     */
    public static StudentCollectionSpec createStudentCollection( int initialCapacity )
     throws StudentCollectionException
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * return the maximum number of elements that can be stored at any one time
     *
     * @return the maximum number of elements that can be stored in the collection
     */
    public int getCapacity();

    /**
     * empty the collection ("throw away" the current contents)
     */
    public void reset();

    /**
     * return whether the collection is full
     *
     * @return boolean indicates whether the collection is currently filled to capacity
     */
    public boolean isFull();

    /**
     * return whether the collection is empty
     *
     * @return whether the collection is currently empty
     */
    public boolean isEmpty();

    /**
     * return the number of elements currently in the collection
     *
     * @return the number of elements currently in the collection
     */
    public int getStudentCount();

    /**
     * return the number of remaining empty positions
     *
     * @return the number of remaining empty positions in the collection
     */
    public int getSpacesRemaining();

    /**
     * add a student to the collection
     *
     * @param aStudent object to be added to the collection
     *
     * @throws StudentCollectionException if there is no room for another student
     */
    public void addStudent( StudentSpec aStudent ) throws StudentCollectionException;

    /**
     * find a student object with an SID that matches the supplied SID;
     * the Student is NOT removed from the collection
     *
     * @param sidKey the SID that a student is to be matched against
     *
     * @return the student with the specified SID (null if not found)
     */
    public StudentSpec retrieveStudentBySID( String sidKey );

    /**
     * find a student object with an SID that matches the supplied SID;
     * the student IS REMOVED FROM THE COLLECTION
     *
     * @param sidKey the SID that a student is to be matched against
     *
     * @return the student with the specified SID (null if not found)
     */
    public StudentSpec removeStudentBySID( String sidKey );

    /**
     * return the contents of the collection, represented as a single String
     *
     * @return the contents of the collection
     */
    @Override
    public String toString();

    /**
     * return an object capable of visiting each element of the
     * collection exactly once
     *
     * @return an Iterator object
     */
    public Iterator<StudentSpec> createIterator();

    // <editor-fold defaultstate="collapsed" desc="<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"> /* */
    // </editor-fold>
    public class StudentCollectionException extends RuntimeException
    {
        private static final long serialVersionUID = 8157997298448463708L;

        /* constructor that accepts a direct reason why the exception is to be created. */
        public StudentCollectionException( String cause )
        {
            super(cause);
        }

        /* constructor that accepts an indirect reason why the exception is created,
         * along with the direct reason (cause) of the exception. */
        public StudentCollectionException( String cause, Throwable causalException )
        {
            super(cause, causalException);
        }

    }

}
