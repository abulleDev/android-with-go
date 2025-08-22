package gomodule

import "errors"

// Function

// Boolean
func Not(b bool) bool {
	return !b
}

// Integer
func AddInt32(a, b int32) int32 {
	return a + b
}

// Floating-point number
func AddFloat32(a, b float32) float32 {
	return a + b
}

func AddFloat64(a, b float64) float64 {
	return a + b
}

// String
func Concat(a, b string) string {
	return a + b
}

// Error
func Divide(a, b int32) (float64, error) {
	if b == 0 {
		return 0, errors.New("cannot divide by zero")
	}
	return float64(a) / float64(b), nil
}
